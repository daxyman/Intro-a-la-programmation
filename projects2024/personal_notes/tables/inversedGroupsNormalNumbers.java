public class inversedGroupsNormalNumbers {
    public static void main(String[] args) {
        int [][] tab1 = {{1,2,3},{4,5,6}};
        
        for (int i = tab1.length -1; i >=0 ; i--) {
            for (int j = 0; j < tab1[i].length; j++) {
            System.out.print(tab1[i][j] + " ");
            }
            System.out.println();
            }
    }
    
}
