package Projects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LetterFounderGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Başlangıçta 4 rastgele harf eklenir; (Gizli)
        ArrayList<String> letters = new ArrayList<>(Arrays.asList("W", "A", "S", "D"));

        // Kullanıcıdan 4 harf alınır;
        for (int i = 0; i < 4; i++) {
            System.out.print((i + 1) + ". harfi girin: ");
            String userInput = scanner.nextLine().toUpperCase();

            // Hatalı giriş kontrolü oluşturulur;
            if (!userInput.matches("[A-Z]")) {
                System.out.println("Hata: Lütfen sadece bir harf girin!");
                i--; // Yanlış girişte kullanıcıya tekrar sorulur!
                continue;
            }

            if (letters.contains(userInput)) {
                // Harf listede varsa "found" ile değiştirilir;
                int index = letters.indexOf(userInput);
                letters.set(index, "found");
            } else {
                // Harf yoksa listeye eklenir;
                letters.add(userInput);
            }
        }

        // Kullanıcı girişlerinden sonra başta gizlenen liste gösterilir;
        System.out.println("Başlangıç listesi (gizliydi): [W, A, S, D]");

        // Kullanıcının girişi doğrultusunda güncellenmiş liste gösterilir;
        System.out.println("Güncellenmiş Liste: " + letters);

        // Scanner kapatılır;
        scanner.close();
    }
}
