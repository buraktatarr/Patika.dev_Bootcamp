package Examples;

import java.util.Scanner;

public class FibonacciSeriesExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        // Fibonacci'yi hatırlayalım, her sayının kendinden bir önceki sayıyla toplanmasından oluşan dizidir.
        // Mesela değerimiz 21 ise: 0, 1, 1, 2, 3, 5, 8, 13, 21 gibi düşünebiliriz.

        if (number < 1) { // 0 ve negatif sayılar için hata mesajı verelim.
            System.out.println("Lütfen 1 ya da daha büyük bir sayı giriniz.");
            scanner.close(); // Scanner'ı kapat
            return; // Programı bitir
        }

        int number1 = 0;
        int number2 = 1;

        System.out.println("Fibonacci Serisi:");

        while (number2 <= number) { // number da dahil edilmeli.
            System.out.print(" - " + number2); // Yan yana yazdır.
            int nextNumber = number2 + number1;
            number1 = number2;
            number2 = nextNumber;
        }

        scanner.close(); // Scanner'ı kapat.
    }
}
