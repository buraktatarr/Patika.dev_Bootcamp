package Projects;

import java.util.Scanner;

public class FlightCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan veri alıyoruz;

        System.out.println("Mesafeyi KM cinsinden girin: "); // KM bilgisi alıyoruz.
        double mesafe = scanner.nextDouble();

        System.out.println("Yaşınızı girin: "); // Yaş bilgisi alıyoruz.
        int yas = scanner.nextInt();

        System.out.println("Yolculuk tipi (1: Tek yön, 2: Gidiş-Dönüş): "); // Uçuş detaylarını alıyoruz.
        int yolculukTipi = scanner.nextInt();

        // Sabit değerleri ekliyoruz;

        double kmBasinaUcret = 0.10; // Her KM için 0.10 TL ücret alıyoruz.
        double biletFiyati = mesafe * kmBasinaUcret;

        // Veri giriş kontrolü yazmamız gerekli koşullar için;

        if (mesafe > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {

            // Yaş indirimlerinin koşulunu yazıyoruz;

            if (yas < 12) {
                biletFiyati *= 0.5; // %50 indirim
            } else if (yas >= 12 && yas <= 24) {
                biletFiyati *= 0.9; // %10 indirim
            } else if (yas > 65) {
                biletFiyati *= 0.7; // %30 indirim
            }

            // Gidiş-dönüş indirim koşulunu yazıyoruz;

            if (yolculukTipi == 2) {
                biletFiyati *= 0.8; // %20 indirim
                biletFiyati *= 2; // Gidiş-dönüş olduğu için fiyat ikiyle çarpılıyor!
            }

            System.out.println("Toplam Bilet Fiyatı: " + biletFiyati + " TL"); // Fiyat bilgisini kullanıcıya veriyoruz.

        } else {
            System.out.println("Hatalı giriş yaptınız! Lütfen geçerli bir mesafe, yaş ve yolculuk tipi giriniz.");
                // İstenen bilginin doğruluğunu koşulda sağlamazsak, kullanıcıya hata mesajı veriyoruz.
        }


        scanner.close(); // Scanner kapatıyoruz!
    }
}
