/*
5. Compteur de mots
Objectif : Écrire un programme qui compte et affiche le nombre de mots dans une phrase entrée par l'utilisateur.

Consignes :

Demandez à l’utilisateur de saisir une phrase.
Utilisez la méthode split() de String pour découper la phrase en mots.
Comptez le nombre de mots et affichez le résultat sous la forme : "Nombre de mots : [nombre]".

Exemple de sortie :

Entrée : "Java est un langage de programmation"
Sortie : "Nombre de mots : 6"
*/
package exercisesS10;
import java.util.Scanner;
public class excercise5 {
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String sentence = scanner.nextLine();
    int wordcount = number(sentence);
    System.out.println("nombre de mots:" + wordcount);
    scanner.close();
}
public static int number(String sentence){
    String[] words = sentence.split("\\s+"); // Split by any whitespace (space, tab, newline, etc.)
    return words.length;
}
}
