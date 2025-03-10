package Projects;

public class MatrixTranspose {
    public static void main(String[] args) {

            // Öncelikle 3x2 boyutunda bir matris tanımlıyoruz;
            int[][] matrix = {
                    {1, 2},
                    {3, 4},
                    {5, 6}
            };

            // Oluşturuğumuz matrisin boyutlarını alıyoruz;
            int rows = matrix.length;        // "rows" ile satır sayısını alıyoruz.
            int cols = matrix[0].length;     // "cols" ile sütun sayısını alıyoruz.

            // Transpoz matrisi oluşturuyoruz; !!(boyutlar ters olacak)!!
            int[][] transpose = new int[cols][rows];

            // Transpoz'u hesaplama;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    transpose[j][i] = matrix[i][j]; // Satır ve sütunun yerini değiştiriyoruz.
                }
            }

            // Farkı göstermek için öncelikle orijinal matrisi yazdırıyoruz;
            System.out.println("Orijinal Matris:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println(); // Satır bittiğinde alt satıra geç.
            }

            // Transpoze edilen matrisi yazdırıyoruz;
            System.out.println("\nTranspoz Matris:");
            for (int i = 0; i < cols; i++) {   // !!! Dikkat: Transpoz matrisin satır sayısı eski matrisin sütun sayısı oluyor!
                for (int j = 0; j < rows; j++) {   // Transpoz matrisin sütun sayısı eski matrisin satır sayısı oluyor!
                    System.out.print(transpose[i][j] + " ");
                }
                System.out.println(); // Satır bittiğinde alt satıra geç.
            }
    }
}