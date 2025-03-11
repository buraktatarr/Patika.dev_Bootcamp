package Projects;

import java.util.Scanner;

public class TypeConversions {
    public static void main(String[] args) {
        // Scanner nesnesi oluşturuyorum;
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan önce bir tam sayı girişi alıyorum;
        System.out.print("Bir tam sayı giriniz: ");
        int tamSayi = scanner.nextInt();

        // Kullanıcıdan bir de ondalıklı sayı girişi alıyorum;
        System.out.print("Bir ondalıklı sayı giriniz: ");
        double ondalikliSayi = scanner.nextDouble();

        // Tam sayıyı ondalıklı sayıya dönüştürüyorum;
        double tamSayiDouble = (double) tamSayi;

        // Ondalıklı sayıyı tam sayıya dönüştürüyorum; (yuvarlama ile)
        // Burada Math.round kullanmamın sebebi, xx,yy sayısının 50 altındayken x'e, 50 üstüyken x + 1'e dönüşmesi için.
        int yuvarlanmisSayi = (int) Math.round(ondalikliSayi);

        // Sonuçları ekrana yazdırıyorum;
        System.out.println("Tam sayının ondalıklı hale dönüştürülmüş hali: " + tamSayiDouble);
        System.out.println("Ondalıklı sayının tam sayıya yuvarlanmış hali: " + yuvarlanmisSayi);

        // En başta açtığımız scanner nesnesini kapatmak gerekli;
        scanner.close();
    }
}

