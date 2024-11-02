package exercisesS8;
/*
 * 3. Nombre premier
    Objectif : Créer une méthode qui vérifie si un nombre donné est premier.

	•	Exemple : boolean estPremier(int n)

	 	Entrée : 11

	 	Sortie : true (11 est premier)
 */
import java.util.Scanner;
public class excercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chiffre = scanner.nextInt();
        if (estprime(chiffre)) {
            System.out.println(chiffre + " est premier");
        } else {
            System.out.println(chiffre + " est n'est pas premier");
        }
        scanner.close();
    }

    public static boolean estprime(int chiffre) {
        boolean result = true;
        for (int i = 2; i < chiffre; i++){
            if (chiffre % i == 0)
            result = false;
        }
        return result;
    }
}