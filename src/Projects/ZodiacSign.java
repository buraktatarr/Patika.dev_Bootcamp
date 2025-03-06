package Projects;

import java.util.Scanner;

public class ZodiacSign {
    public static void main(String[] args) {
        // Scanner sınıfı ile kullanıcıdan giriş alıyoruz
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz: ");
        int birthYear = scanner.nextInt();

        // Çin Zodyağı burçlarını içeren bir dizi
        String[] zodiac = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz", "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"};

        // Doğum yılının 12 ile bölümünden kalanı hesaplayarak burcu buluyoruz
        String zodiacSign = zodiac[birthYear % 12];

        System.out.println("Çin Zodyağı Burcunuz: " + zodiacSign);

        scanner.close();
    }
}
