package personal_notes.tables;  //THIS WILL ONLY RUN INTS, NO STRING NO DOUBLES NO NUN, ONLY INTS
import java.util.Scanner;

public class infinitetable {
    public static void main(String[] args){
        infinitetable.tableauManager();
    }
    public static void tableauManager(){
        Scanner scanner = new Scanner(System.in);
        
        // Initial size and count of elements in the array
        int[] tableau = new int[2];  // start with a small array, like size 2
        int taille = 0;  // keeps track of the actual number of elements
        
        // Loop to get user input
        while (true) {
            System.out.print("Entrez une nouvelle valeur (ou -1 pour arrêter) : ");
            int nouvelElem = scanner.nextInt();
            
            if (nouvelElem == -1) {
                break;  // exit loop if the user enters -1
            }
            
            // Add the element and resize if necessary
            if (taille == tableau.length) {
                tableau = redimensionnerTableau(tableau); // resize when full
            }
            
            tableau[taille] = nouvelElem;
            taille++;  // increment the size after adding the element
        }
        
        // Display the elements in the array
        System.out.println("Le tableau après l'ajout des éléments : ");
        for (int i = 0; i < taille; i++) {
            System.out.print(tableau[i] + " ");
        }
        scanner.close();
    }


    private static int[] redimensionnerTableau(int[] tableau) {
        int[] nouveauTableau = new int[tableau.length * 2]; // double the size
        System.arraycopy(tableau, 0, nouveauTableau, 0, tableau.length); // use System.arraycopy for fast copying
        return nouveauTableau;
    
    }
    
}
