package CodingBasics;

public class IfElseCommands {
    public static void main(String[] args) {

        int sayi = 3;

        if (sayi >= 5) { //false
            //Şart gerçekleşirse çalışacak
            System.out.println("Sayı 5'ten büyük ve ya 5'e eşit");

        } else if (sayi <0) {
            System.out.println("Sayı 0'dan küçük");


        } else if (sayi == 5) {
            System.out.println("Sayı 5'e eşit!");

        } else {
            System.out.println("sayı 5'ten büyük değil");
        }

        int not = 85;
        String harfnotu;
        
        if(not > 85){
            harfnotu = "A";
            
        } else if (not >= 70) {
            harfnotu = "B";
            
        } else if (not >= 60) {
            harfnotu = "C";
            
        } else {
            harfnotu = "D";
        }
        System.out.println(harfnotu);
    }   
}
