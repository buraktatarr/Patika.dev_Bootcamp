package Projects;

import java.util.Scanner;

public class FlightCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan veri al
        System.out.println("Mesafeyi KM cinsinden girin: ");
        double mesafe = scanner.nextDouble();

        System.out.println("Yaşınızı girin: ");
        int yas = scanner.nextInt();

        System.out.println("Yolculuk tipi (1: Tek yön, 2: Gidiş-Dönüş): ");
        int yolculukTipi = scanner.nextInt();

        // Sabit değerler
        double kmBasinaUcret = 0.10; // Her KM için 0.10 TL ücret
        double biletFiyati = mesafe * kmBasinaUcret;

        // Geçerli giriş kontrolü
        if (mesafe > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {

            // Yaş indirimi hesaplama
            if (yas < 12) {
                biletFiyati *= 0.5; // %50 indirim
            } else if (yas >= 12 && yas <= 24) {
                biletFiyati *= 0.9; // %10 indirim
            } else if (yas > 65) {
                biletFiyati *= 0.7; // %30 indirim
            }

            // Gidiş-dönüş indirimi hesaplama
            if (yolculukTipi == 2) {
                biletFiyati *= 0.8; // %20 indirim
                biletFiyati *= 2; // Gidiş-dönüş olduğu için fiyat ikiyle çarpılıyor
            }

            System.out.println("Toplam Bilet Fiyatı: " + biletFiyati + " TL");

        } else {
            System.out.println("Hatalı giriş yaptınız! Lütfen geçerli bir mesafe, yaş ve yolculuk tipi giriniz.");
        }

        scanner.close();
    }
}
