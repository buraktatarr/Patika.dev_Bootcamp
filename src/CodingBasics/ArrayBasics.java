package CodingBasics;

public class ArrayBasics {
    // Java'da Tek Boyutlu Diziler (Arrays) - Temel Bilgiler
    // Arrays, aynı türde birden fazla değeri saklamak için kullanılan veri yapılarıdır.

    public static void main(String[] args) {
        // 1. Dizi Tanımlama ve Değer Atama

        // Bir integer dizisi tanımlıyoruz (5 elemanlı, başlangıç değerleri 0'dır)
        int[] sayilar = new int[5];

        // Dizinin elemanlarına değer atayalım
        sayilar[0] = 10; // İlk eleman (index 0)
        sayilar[1] = 20;
        sayilar[2] = 30;
        sayilar[3] = 40;
        sayilar[4] = 50; // Son eleman (index 4)

        // Alternatif olarak diziyi doğrudan şu şekilde de tanımlayabiliriz:
        int[] sayilar2 = {15, 25, 35, 45, 55};

        // 2. Dizi Elemanlarına Erişim ve Yazdırma

        // Tek tek elemanlara erişim
        System.out.println("İlk eleman: " + sayilar[0]);
        System.out.println("Son eleman: " + sayilar[4]);

        // Döngü ile tüm elemanları yazdıralım
        System.out.println("Dizideki tüm elemanlar:");
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println("Index " + i + ": " + sayilar[i]);
        }

        // 3. En Büyük ve En Küçük Elemanı Bulma

        // Bir dizi oluşturalım
        int[] dizi = {15, 42, 8, 23, 4};

        // İlk elemanı en büyük ve en küçük olarak kabul ediyoruz
        int enBuyuk = dizi[0];
        int enKucuk = dizi[0];

        // Döngü ile dizideki tüm elemanları kontrol ediyoruz
        for (int i = 1; i < dizi.length; i++) {
            // Eğer mevcut eleman en büyükten büyükse, en büyük güncellenir
            if (dizi[i] > enBuyuk) {
                enBuyuk = dizi[i];
            }

            // Eğer mevcut eleman en küçükten küçükse, en küçük güncellenir
            if (dizi[i] < enKucuk) {
                enKucuk = dizi[i];
            }
        }

        // Sonuçları ekrana yazdırıyoruz
        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);
    }

}

