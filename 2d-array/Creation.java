public class Creation {
    public static void main(String[] args) {
        // Create a 2D array with specified dimensions
        int[][] array2D = new int[5][3];

        // Populate the 2D array with values
        int value = 1;
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                array2D[i][j] = value;
                value++;
            }
        }

        // Print the dimensions of the array
        System.out.println("Number of rows: " + array2D.length);
        System.out.println("Number of columns: " + array2D[0].length);

        // Print the 2D array
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < array2D[0].length; i++) {
            System.out.print(array2D[0][i] + ", ");
        }
    }
}
