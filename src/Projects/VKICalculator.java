package Projects;

import java.util.Scanner;

public class VKICalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (Metre cinsinden/Ör. 1,65) giriniz: ");
        double boy;
        boy = scanner.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz: ");

        // Kilo (kg) / Boy(m) * Boy(m)

        double kg = scanner.nextDouble();
        double vki = kg / (boy * boy);
        System.out.println("Vücut kitle indeksiniz : " + vki);

        // Bu sayede, Vücut Kitle İndeksimizi basitçe ölçebiliriz!

    }
}
