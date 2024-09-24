public class table2dFrontToBack {
    public static void main(String[] args) {
        int[][] tab1 = {{1, 2, 3},
                        {4, 5, 6}};
    
        // Iterate through the rows in reverse order
        for (int i = 0; i < tab1.length; i++) {
            // Iterate through the elements in the current row in reverse order
            for (int j = tab1[i].length - 1; j >= 0; j--) {
                System.out.print(tab1[i][j] + " ");
            }
            System.out.println(); // Add space between rows
        }
    }
}
