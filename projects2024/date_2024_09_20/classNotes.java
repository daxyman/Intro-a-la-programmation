public class classNotes{
    public static void main(String[] args) {
        //creation et installation de chaïnes
        String message = "bonjour, tout le monde";
        String completeMessage = message +" comment ça va?"; //result:
        String completeMessage2 = message.concat("comment ça va?"); //result:

        //extraction d'une sous chaîne (substring())
        String sousChaine = message.substring(8, 12); //resultat: tout

        //modification de la classe (toUpperCase()), toLowerCase())
        String majuscules = message.toUpperCase();
        String minuscules = message.toLowerCase();

        //


        //déclarer un tableau de 2 lignes et 3 colognes
        int[][] tab = new int [2] [3];

        //{ {1,2,3}, {4,5,6}}
        int[][] tab1 = {{1,2,3},
                        {4,5,6}};


        int[] TabTest = new int [2];        // this unironically has nothing to do with the 
        for(int i=0; i<TabTest.length; i++); // rest going on tbh idk what it does



        for (int i = 0; i < tab1.length; i++) { //length of an array starts at 1, given that it is a literal count of elements, the array numbering starts at 0, yes, but the numbering has to be from 1, because you can not have 0 of anything
            for (int j = 0; j < tab1[i].length; j++) {
            System.out.print(tab1[i][j] + " ");
            }
            System.out.println();
            }
    }
}