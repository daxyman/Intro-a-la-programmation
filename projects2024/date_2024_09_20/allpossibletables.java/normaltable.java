public class normaltable {
    public static void main(String[] args) {
        //{ {1,2,3}, {4,5,6}}
        int[][] tab1 = {{1,2,3}, {4,5,6}};

        for (int i = 0; i < tab1.length ; i++) {
            for (int j = 0; j < tab1[i].length; j++) {
            System.out.print(tab1[i][j] + " ");
            }
            System.out.println();
            }
    }
}
