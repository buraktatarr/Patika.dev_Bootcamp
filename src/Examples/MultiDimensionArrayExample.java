package Examples;

public class MultiDimensionArrayExample {
    public static void main(String[] args) {

        // 2D bir dizi (matris) tanımlıyoruz. 3x3 boyutunda.
        int[][] matrix = {
                {1, 2, 3}, // [0,0] [0,1] [0,2]
                {4, 5, 6}, // [1,0] [1,1] [1,2]
                {7, 8, 9}  // [2,0] [2,1] [2,2]
        };

        // Sum değişkenini sıfır olarak başlatıyoruz.
        // Bu değişkenin içine köşegen elemanlarının toplamını alacağız.

        int sum = 0;

        // İlk döngü, matrisin satırları üzerinde iterasyon yapacak.
        for (int i = 0; i < matrix.length; i++) {  // matrix.length, satır sayısını verir.

            // İkinci döngü, her satırdaki sütunlar üzerinde iterasyon yapacak.

            for (int j = 0; j < matrix[i].length; j++) {  // matrix[i].length, her satırdaki sütun sayısını verir.

                // Eğer satır numarası ve sütun numarası eşitse, yani köşegen elemanları ise,
                if (i == j) {
                    // O zaman bu elemanı 'sum' değişkenine ekliyoruz.
                    sum += matrix[i][j];
                }

            }

        }

        // Toplamı ekrana yazdırıyoruz.
        System.out.println("Toplam = " + sum); // Köşegen elemanlarının toplamını yazdırıyoruz.
    }
}
