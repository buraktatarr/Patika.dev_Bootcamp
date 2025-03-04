package Examples;

import java.util.Scanner;

public class TemperatureExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Havanın sıcaklığını Fahreneit cinsinden giriniz: " );
        double f = scanner.nextDouble();

        // F = (C * 1.8) + 32 cinsinden hesaplanır.
        double celcius = (f / 1.8) - 32;
        System.out.println("Celcius cinsinden hava sıcaklığı: " + celcius);

        // Burada Hava sıcaklığını Celcius cinsinden Bulabiliriz!!!

        /*
         * O halde bir de Tam Tersini yazalım!
         */

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Havanın sıcaklığını Celcius cinsinden giriniz: ");

        double celcius1 = scanner1.nextDouble();

        // F = (C * 1.8) + 32 ile hesaplanır.

        double f1 = (celcius1 * 1.8) + 32;
        System.out.println("Celcius cinsinden hava sıcaklığı: " + f1);

        // Burada ise hava sıcaklığını Fahreneit cinsinden Bulabiliriz!!!
    }
}
