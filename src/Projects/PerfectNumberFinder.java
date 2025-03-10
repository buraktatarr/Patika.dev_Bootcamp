package Projects;

import java.util.Scanner;

public class PerfectNumberFinder {
    public static void main(String[] args) {
       // Scanner açıyoruz;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: "); // Kullanıcıdan değer alıyoruz.
        int number = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= number / 2; i++) { // Sayının yarısına kadar olan bölenleri kontrol edecek koşulu yazıyoruz.
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum == number && number != 0) {
            // Koşul doğru ise bu çıktıyı alıyoruz;
            System.out.println(number + " Mükemmel sayıdır.");
        } else {
            // Koşul yanlış ise bu çıktıyı alıyoruz;
            System.out.println(number + " Mükemmel sayı değildir.");
        }
    }
}
