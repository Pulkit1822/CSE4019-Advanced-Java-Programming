import java.util.Scanner;

public class MatrixOperations {

    // Function to perform matrix addition
    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Function to perform matrix subtraction
    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    // Function to perform matrix multiplication
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    // Function to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter dimensions of first matrix (rows columns):");
        int rows1 = scanner.nextInt();
        int cols1 = scanner.nextInt();
        int[][] matrix1 = new int[rows1][cols1];

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter dimensions of second matrix (rows columns):");
        int rows2 = scanner.nextInt();
        int cols2 = scanner.nextInt();
        int[][] matrix2 = new int[rows2][cols2];

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        if (cols1 != rows2) {
            System.out.println("Matrix multiplication not possible. Number of columns in first matrix must equal number of rows in second matrix.");
        } else {
            System.out.println("Matrix addition:");
            displayMatrix(add(matrix1, matrix2));

            System.out.println("Matrix subtraction:");
            displayMatrix(subtract(matrix1, matrix2));

            System.out.println("Matrix multiplication:");
            displayMatrix(multiply(matrix1, matrix2));
        }

        scanner.close();
    }
}
