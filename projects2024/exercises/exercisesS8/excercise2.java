/* 2. Somme des chiffres d’un nombre
Objectif : Créer une méthode qui prend un entier en entrée et renvoie la somme de ses chiffres.

•	Exemple : int sommeChiffres(int n)

    Entrée : 123

    Sortie : 6 (1 + 2 + 3) */
package exercisesS8;

import java.util.Scanner;

public class excercise2 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez numero a somer");
        int n = scanner.nextInt();
        n = someChiffres(n);
        System.out.println("number ih: " + n);
        scanner.close();
    }
    public static int someChiffres(int n){
        int length = String.valueOf(n).length();
        for(int i=0; i<length; i++){
            
        }

        int m = (n/100);

        return m;
    }
}

