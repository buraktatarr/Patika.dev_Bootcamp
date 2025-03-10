package Examples;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç elemanlı bir dizin oluşturmak istiyorsunuz? ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println(size + " adet sayı giriniz:");

        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + " . sayıyı giriniz:");
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
