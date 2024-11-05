/*
2. Calculateur de jours dans un mois
Objectif : Écrire un programme Java qui demande à l'utilisateur de saisir un chiffre entre 1 et 12 (correspondant au mois de l’année) et retourne le nombre de jours dans ce mois.
Consignes :
Demandez à l’utilisateur de saisir un chiffre entre 1 et 12.
Utilisez une structure de contrôle (comme switch ou if-else) pour retourner le nombre de jours en fonction du mois.
Affichez le résultat sous la forme : "Le mois [numéro] a [nombre de jours] jours."
Structurez votre code en créant une méthode séparée pour obtenir le nombre de jours dans un mois.

Exemple de sortie :

Entrée : 1
Sortie : "Le mois 1 a 31 jours."

Entrée : 2
Sortie : "Le mois 2 a 28 jours."
*/

package excercicess10;
import java.util.Scanner;
public class excercise2 {
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("saisir un chiffre entre 1 et 12.");
int n = scanner.nextInt();
scanner.close();
int m = jours(n);
System.out.println("le mois numero " + n + " a " + m + " jours");

}
public static int jours(int n){
    int amount = 0;
    switch (n) {
        //1, 3, 5, 7, 8, 10, 12
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
        amount = 31;
    }
    switch (n) {
        //4, 6, 9, 11
        case 4:
        case 6:
        case 9:
        case 11:
        amount = 30;
    }
    switch (n) {
        //28
        case 2:
        amount = 28;
    }
    return amount;
}
    
}
