package Examples;

import java.util.Scanner;

public class MatrixSearchExample {
    public static void main(String[] args) {

        int[][] matrix = {
                {10, 20},   // [0,0] [0,1]
                {40, 60},   // [1,0] [1,1]
                {70, 90},   // [2,0] [2,1]
                {110, 140}, // [3,0] [3,1]
        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir değer giriniz: ");
        int input = scanner.nextInt();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                if (input == matrix[i][j]){
                    System.out.println("Satır: " + i + " - Sütun: " + j);
                    break;
                } else {
                }
            }
        }
        System.out.println("Girdiğiniz değer dizin sınırları dışındadır!");
    }
}
