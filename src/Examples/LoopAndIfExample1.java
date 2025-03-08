package Examples;

import java.util.Scanner;

public class LoopAndIfExample1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Sayı pozitif bir sayıdır. Sayı: " + number);
        } else if (number < 0) {
            System.out.println("Sayı negatif bir değerdir. Sayı: " + number);
        } else {
            System.out.println("Bu sayı sıfıra eşittir. Sayı: " + number);
        }
    }
}
