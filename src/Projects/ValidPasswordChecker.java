package Projects;

import java.util.Scanner;

public class ValidPasswordChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Bir scanner yazıyoruz, veri almak için;
        System.out.println("Bir şifre giriniz;\n" +
                "1-En az 8 karakter içermeli\n" +
                "2-Space karakteri içermemeli\n" +
                "3-İlk harf büyük harf olmalı\n" +
                "4-Son karakteri ? olmalıdır.\n" ); // Çıktımızda şifre niteliklerini belirtiyoruz.


        while (true) {
            String password = scanner.nextLine(); // Kullanıcıdan şifreyi alıyoruz.

            boolean isValid = true; // Bir kontrol mekanizması atıyoruz;

            if (password.length() < 8) {
                System.out.println("Şifreniz min. 8 karakterden oluşmalıdır! ");
                System.out.println();
                isValid = false;
            }

            if (!password.matches("^[A-Z].*")) {
                System.out.println("Şifreniz en az bir büyük harf içermelidir! ");
                System.out.println();
                isValid = false;
            }

            if (password.contains(" ")) {
                System.out.println("Şifrenizde boşluk bulunmamalıdır! ");
                System.out.println();
                isValid = false;
            }

            if (!password.matches(".*\\?$")) {
                System.out.println("Şifreniz ? karakteri ile bitmelidir!");
                System.out.println();
                isValid = false;
            }
            // Eğer her şey doğru ise çıktı pozitif değer veriyor!
            if (isValid) {
                System.out.println("Şifrenizi başarılı şekilde kaydettiniz... ");
            }
            // Eğer yanlış var ise çıktı negatif değer veriyor!
            else {
                System.out.println("Geçersiz şifre girdiniz lütfen yönergeyi okuyup tekrar deneyin! ");
                System.out.println();
            }
        }
    }
}