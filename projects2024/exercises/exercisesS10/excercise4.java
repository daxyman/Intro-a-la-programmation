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
        char[] zaword = word.toCharArray();
        scanner.close();
        word = vowelCheck(zaword);//loop to print word
        System.out.println(zaword);

    }
    public static String vowelCheck(char[] zaword){
        if(Character.isLowerCase(zaword[0])){
            zaword[0] = Character.toUpperCase(zaword[0]);
        }
        for (int i = 1; i < zaword.length; i++) {
            if (Character.isUpperCase(zaword[i])) {
                zaword[i] = Character.toLowerCase(zaword[i]);
            } else if (Character.isLowerCase(zaword[i])) {
                zaword[i] = Character.toUpperCase(zaword[i]);
            }
        }
        return new String(zaword);
    }
    
}
