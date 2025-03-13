package MethodExamples;

import java.util.Scanner;

public class PowerNumberExample {
    // Recursive üs alma
    // 2 üssü 3 -> 2 * 2 * 2 = 8

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("TABAN DEĞERİ GİRİNİZ: ");
        int base = scanner.nextInt();

        System.out.println("ÜS DEĞERİ GİRİNİZ: ");
        int power = scanner.nextInt();

        int result = power(base, power);

        System.out.println(base + " üssü " + power + " = " + result);
    }

    private static int power(int base, int power){
        if (power == 0) return 1;
        return base * power(base, power - 1);

    }
}
