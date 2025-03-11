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

        // Ondalıklı sayıyı tam sayıya dönüştürüyorum;
        int ondalikliSayiInt = (int) ondalikliSayi;

        // Sonuçları ekrana yazdırıyorum;
        System.out.println("Tam sayının ondalıklı hale dönüştürülmüş hali: " + tamSayiDouble);
        System.out.println("Ondalıklı sayının tam sayıya dönüştürülmüş hali: " + ondalikliSayiInt);

        // En başta açtığımız scanner nesnesini kapatmak gerekli;
        scanner.close();
    }
}

