// Bir matrisin transpozunu alma

public class Main {

    public static void main(String[] args) {

        int[][] matrix = {{2, 3, 4}, {5, 6, 4},{8, 15, 7}, {6, 9, 20}};
        int[][] transposeMatrix = new int[matrix[0].length][matrix.length];

        System.out.println("Matris:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatrisin Transpozu: ");

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                transposeMatrix[i][j] = matrix[j][i];
                System.out.print(transposeMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}