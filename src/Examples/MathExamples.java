package Examples;

import java.util.Scanner;

public class MathExamples {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: "); // Kullanıcıdan bir sayı girmesi için çıktı veriyoruz.
        double number = scanner.nextDouble();

        System.out.println("Yuvarlanmış sayınız -> " + Math.round(number));

        System.out.println("Yukarı yuvarlanmış sayınız -> " + Math.ceil(number));

        System.out.println("Aşağıya yuvarlanmış sayınız -> " + Math.floor(number));

    }
}