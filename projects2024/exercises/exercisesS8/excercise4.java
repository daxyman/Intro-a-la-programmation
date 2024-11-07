/*
 * 4. Somme d’un tableau
    Objectif : Écrire une méthode qui calcule la somme des éléments d’un tableau.

	•	Exemple : int sommeTableau(int[] tableau)

	 	Entrée : [1, 2, 3, 4, 5]

	 	Sortie : 15
 */
package exercisesS8;
import java.util.Scanner;

public class excercise4 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("combien de chiffres voulez vous dans la table?");
    int n = scanner.nextInt(); 
    int[] table = new int[n];
    table = sommeTableau(table);
    }
    public static int[] sommeTableau(int[] table, int n){
        int[] somme = new int[n];
        somme[0] = 2;
        return somme;
    }
}
