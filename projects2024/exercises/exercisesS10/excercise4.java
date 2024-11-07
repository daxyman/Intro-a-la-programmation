/*
4. Inversion de casse
Objectif : Utiliser les classes Java Character et String pour transformer tous les caractères majuscules en minuscules et vice versa, sauf le premier caractère qui doit toujours être en majuscule.
 
Exemple de sortie :

Entrée : "Bonjour"
Sortie : "Bonjour"

Entrée : "jAVA eST pASSIONNANT"
Sortie : "Java est passionnant"
*/
package exercisesS10;
import java.util.Scanner;
public class excercise4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("gimme a word bae: ");
        String word = scanner.nextLine();
        scanner.close();
        word = vowelCheck(word);

    }
    public static String vowelCheck(String word){
        String inverse = "hello";
        return inverse;
    }
    
}
