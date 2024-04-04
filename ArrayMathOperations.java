public class ArrayMathOperations {
    public static void main(String[] args) {
        int[] array1 = {10, 5, 8, 12};
        int[] array2 = {3, 7, 2, 9};

        // Addition
        System.out.println("Sum:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + array2[i] + " ");
        }
        System.out.println();

        // Subtraction
        System.out.println("Difference:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] - array2[i] + " ");
        }
        System.out.println();

        // Multiplication
        System.out.println("Product:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] * array2[i] + " ");
        }
        System.out.println();

        // Division
        System.out.println("Quotient:");
        for (int i = 0; i < array1.length; i++) {
            if (array2[i] != 0) {
                System.out.print((double) array1[i] / array2[i] + " ");
            } else {
                System.out.print("NaN ");
            }
        }
        System.out.println();
    }
}