package date_2024_09_24;

public class notes {
    public static void main(String[] args){
        //string = pimitive?
        String phrase = "bonjour tout le monde";
        String sousChaine = phrase.substring(8, 12);
        String phraseMaj = phrase.toUpperCase();
        String phraseReemplace = phrase.replace("o", "a");
        int longueur = phrase.length();

        //insert and remove data from a 2d table
        //boucles imbriquées (for statement on top of a for statemet, see 2024 09 20)

        String[][] tab1={{"sara","bob"}, {"alice","tom"}};
        for(int i=0; i<tab1.length;i++){
            for(int j=0; j<tab1[i].length; j++){
            System.out.print(tab1[i][j] + " ");
        }
        System.out.println();
        }


    }
}
