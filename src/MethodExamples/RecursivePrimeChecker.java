package MethodExamples;

import java.util.Scanner;

public class RecursivePrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        if (isPrime(number, 2)) {
            System.out.println(number + " asal bir sayıdır.");
        } else {
            System.out.println(number + " asal bir sayı değildir.");
        }
    }

    // Recursive asal kontrol fonksiyonu
    private static boolean isPrime(int number, int divisor) {
        if (number < 2) {
            return false; // 0 ve 1 asal sayı değildir.
        }
        if (divisor > number / 2) {
            return true; // Eğer sayı kendisinden küçük hiçbir sayıya bölünmediyse asaldır.
        }
        if (number % divisor == 0) {
            return false; // Eğer sayı herhangi bir bölene tam bölünüyorsa asal değildir.
        }
        return isPrime(number, divisor + 1); // Bir sonraki böleni dene
    }

}
