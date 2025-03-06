package Projects;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        // Scanner sınıfı ile kullanıcıdan giriş alıyoruz
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yıl Giriniz: ");
        int year = scanner.nextInt();

        // Artık yıl kontrolü
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Çıktı alma kontrolü
        if (isLeapYear) {
            System.out.println(year + " bir artık yıldır!");
        } else {
            System.out.println(year + " bir artık yıl değildir!");
        }

        scanner.close();
    }
}
