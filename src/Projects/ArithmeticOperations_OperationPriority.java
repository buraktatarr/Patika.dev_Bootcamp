package Projects;

import java.util.Scanner;

public class ArithmeticOperations_OperationPriority {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Öncelikle bir scanner yazıyoruz.

        System.out.println("Sizden 3 adet sayı girmenizi istiyorum:");

        System.out.println(" A sayısını giriniz: "); // A sayısını kullanıcıdan alıyoruz.
        int a = scanner.nextInt();

        System.out.println(" B sayısını giriniz: "); // B sayısını Kullanıcıdan alıyoruz.
        int b = scanner.nextInt();

        System.out.println(" C sayısını giriniz: "); // C sayısını kullanıcıdan alıyoruz.
        int c = scanner.nextInt();

        int sonuc = a+(b*c)-b; // kullanıcıdan aldığımız değerlerin burada istenen işlemini yapıyoruz.

        System.out.println("İşlem sonucunuz; " + sonuc); // İşlem sonucunu kullanıcıyla paylaşıyoruz.

        scanner.close(); // Açtığımız scanner'ı kapatıyoruz.

    }
}
