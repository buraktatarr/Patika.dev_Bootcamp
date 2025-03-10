package Projects;

import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        // Bir scanner açıyoruz;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: "); // Kullanıcıdan üst basamak için istediği değeri alıyoruz.
        int n = scanner.nextInt();

        // Dış döngü oluşturup satırları kontrol ediyoruz.
        for (int i = n; i > 0; i--) {

            // İç döngü oluşturup yıldızları ekrana yazdırıyoruz.
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println(); // Üçgenimizi bastırıyoruz.
        }
    }
}
