package Projects;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GroceryCheckoutCalculator {
    public static void main(String[] args) {

        // DecimalFormat'ı düzgün biçimde oluşturuyoruz!
        // Bunun nedeni, çıktı alırken fazla küsürat görmemek içindir!

        DecimalFormat format = new DecimalFormat("0.00");

        Scanner scanner = new Scanner(System.in);

        // Kullanıcıya fiyat vermek için için gerekli soruları souyoruz;
        // Bu verilerle elimizde olan verileri birleştireceğiz.

        System.out.println("Armut kaç Kilo: ");
        double kilo = scanner.nextDouble();
        double armut = kilo * 2.14;

        System.out.println("Elma kaç Kilo: ");
        double kilo1 = scanner.nextDouble();
        double elma = kilo1 * 3.67;

        System.out.println("Domates kaç kilo: ");
        double kilo2 = scanner.nextDouble();
        double domates = kilo2 * 1.11;

        System.out.println("Muz kaç kilo: ");
        double kilo3 = scanner.nextDouble();
        double muz = kilo3 * 0.95;

        System.out.println("Patlıcan kaç kilo: ");
        double kilo4 = scanner.nextDouble();
        double patlican = kilo4 * 5.00;

        // Burada toplam tutarı hesaplıyoruz;
        double toplamTutar = armut + elma + domates + muz + patlican;

        // Bulduğumuz sonucu kullanıcı ile paylaşıyoruz;
        System.out.println("Toplam Tutar: " + format.format(toplamTutar) + " TL");

    }
}
