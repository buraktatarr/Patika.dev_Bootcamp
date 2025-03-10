package Projects;

import java.util.Scanner;

public class FindingMinMaxValue {
    public static void main(String[] args) {
        // Kullanıcıdan sayı almak için scanner oluşturuyoruz.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: "); // Kullanıcıdan br sayı alıyoruz.
        int number = scanner.nextInt();

        int sum = 0;
        int count = 0;

        for (int i = 1; i <= number; i++) { // i=1'den başlatıldı, böylece 0 dahil olmaz
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            // Denklem doğru çalışırsa ve sayı bölünebiliyorsa bu çıktıyı alırız.
            System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + average);
        } else {
            // aksi takdirde bu çıktıyı alırız.
            System.out.println("3 ve 4'e tam bölünen herhangi bir sayı bulunamadı.");
        }
    }
}


