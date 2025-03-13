package MethodExamples;

import java.util.Scanner;

public class RecursiveDigitsumExample {
    public static void main(String[] args) {
        // 123--> 1+2+3=6 gibi bir örnek;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz; ");
        int number = scanner.nextInt();

        int sum = sumOfdigits(number);
        System.out.println(number + " basamak toplamı --> " + sum);
    }

    private static int sumOfdigits(int number){
        if(number == 0) return 0;
        return(number % 10) + sumOfdigits(number / 10);
    }

}
