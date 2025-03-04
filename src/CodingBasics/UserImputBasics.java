package CodingBasics;

import java.util.Scanner;

public class UserImputBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adınızı Girin: ");

        String name = scanner.nextLine();
        System.out.println("Yaşınızı Girin: ");
        int age = scanner.nextInt();

        System.out.println("Merhaba " + name + "sen " + age + " yaşındasın demek!");
        System.out.println("Tanıştığıma memnun oldum " + name);

        scanner.close();

        }
}
