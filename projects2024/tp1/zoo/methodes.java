package tp1.zoo;
import java.util.Scanner;
public class methodes{
    
    public static void ajouterVisiteursParAnimal(){
    }
    public static void calculerTotalVisiteursZoo(){  
    }
    public static void calculerPoidsMoyenAnimauxZoo(){   
    }
    public static void trouverAnimauxExtremes(){   
    }
    public static void afficherResumeCompletZoo(){   
    }
    
    public static String[][] redimensionnerTableau(String[][] tableau) {
        String[][] nouveauTableau = new String[tableau.length * 2][3]; // double the size, keep 3 columns
        for (int i = 0; i < tableau.length; i++) {
            System.arraycopy(tableau[i], 0, nouveauTableau[i], 0, tableau[i].length); // copy each row
        }
        return nouveauTableau;
    }
    
}




