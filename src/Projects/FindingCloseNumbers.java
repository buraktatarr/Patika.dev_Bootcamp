package Projects;

import java.util.*;

public class FindingCloseNumbers {
    public static void main(String[] args) {

        //Önce kullanıcıdan değerleri girmesi için scanner açıyoruz;
        Scanner scanner = new Scanner(System.in);
        int numindex = 10;  // Ödev gereği 10 eleman alınacak

        Set<Integer> numbersSet = new HashSet<>(); // Benzersiz sayıları tutmak için Set kullanıyoruz

        System.out.println("Pozitif ve birbirinden benzersiz 10 adet sayıyı sırasıyla giriniz! ");

        while (numbersSet.size() < numindex) {
            System.out.print("Bir sayı girin: ");
            int num = scanner.nextInt();
            if (num > 0) {  // Pozitif sayı kontrolü
                numbersSet.add(num);  // Set'e ekle
            } else {
                System.out.println("Lütfen pozitif bir sayı girin!");
            }
        }

        // Set'i ArrayList'e çeviriyoruz çünkü sıralama işlemi için List gerekiyor
        ArrayList<Integer> numbers = new ArrayList<>(numbersSet);

        System.out.println("Girilen sayılar: " + numbers);

        scanner.close();

        Collections.sort(numbers);  // Sayıları küçükten büyüğe sıralıyoruz
        System.out.println("Sayıları küçükten büyüğe sıralıyorum: " + numbers);

        int minDifference = Integer.MAX_VALUE;
        int num1 = 0, num2 = 0;

        // En küçük farkı bulmak için döngü
        for (int i = 0; i < numbers.size() - 1; i++) {
            int diff = Math.abs(numbers.get(i) - numbers.get(i + 1));
            if (diff < minDifference) {
                minDifference = diff;
                num1 = numbers.get(i);
                num2 = numbers.get(i + 1);
            }
        }

        System.out.println("Birbirine en yakın sayı grubu: " + num1 + " ile " + num2);
    }
}
