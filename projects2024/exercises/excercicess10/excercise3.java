/*
3. Déterminateur de signe astrologique
Objectif : Écrire une méthode Java qui reçoit un mois et un jour en paramètre et retourne le signe astrologique associé.
Consignes :
Créez une méthode getSigneAstrologique(int mois, int jour) qui prend en paramètre le mois et le jour.
Utilisez des conditions pour déterminer le signe astrologique en fonction de la date.
Si le mois ou le jour est invalide, retournez "invalide".
Affichez le résultat dans le programme principal.

Exemple de signes :
Capricorne : 22/12 au 20/1
Verseau : 21/1 au 19/2
Poissons : 20/2 au 20/3
Bélier : 21/3 au 20/4
Taureau : 21/4 au 20/5
Gémeaux : 21/5 au 21/6
Cancer : 22/6 au 22/7
Lion : 23/7 au 22/8
Vierge : 23/8 au 22/9
Balance : 23/9 au 22/10
Scorpion : 23/10 au 22/11
Sagittaire : 23/11 au 21/12

Exemple de sortie :

Entrée : Mois = 3, Jour = 15
Sortie : "Le signe astrologique est Poissons."

Entrée : Mois = 13, Jour = 10
Sortie : "invalide" 
*/

package exercicesS10;
import java.util.Scanner;
public class excercise3 {
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Month: ");
        int m = scanner.nextInt();
        System.out.println("Day: ");
        int d = scanner.nextInt();
        int z = verification(m,d);
        scanner.close();
    }
    public static int verification(int m, int d) {
        switch (m) {
            case 1: // Capricorne : 22/12 au 20/1, Verseau : 21/1 au 19/2
                if (d < 1 || d > 31) {
                    System.out.println("Error");
                    break;
                }
                if (d <= 20) {
                    System.out.println("Capricorne");
                } else {
                    System.out.println("Verseau");
                }
                break;
                
            case 2: // Verseau : 21/1 au 19/2, Poissons : 20/2 au 20/3
                if (d < 1 || d > 29) { // Considering leap year could allow up to 29 days in February
                    System.out.println("Error");
                    break;
                }
                if (d <= 19) {
                    System.out.println("Verseau");
                } else {
                    System.out.println("Poissons");
                }
                break;
                
            case 3: // Poissons : 20/2 au 20/3, Bélier : 21/3 au 20/4
                if (d < 1 || d > 31) {
                    System.out.println("Error");
                    break;
                }
                if (d <= 20) {
                    System.out.println("Poissons");
                } else {
                    System.out.println("Bélier");
                }
                break;
                
            case 4: // Bélier : 21/3 au 20/4, Taureau : 21/4 au 20/5
                if (d < 1 || d > 30) {
                    System.out.println("Error");
                    break;
                }
                if (d <= 20) {
                    System.out.println("Bélier");
                } else {
                    System.out.println("Taureau");
                }
                break;
                
            case 5: // Taureau : 21/4 au 20/5, Gémeaux : 21/5 au 21/6
                if (d < 1 || d > 31) {
                    System.out.println("Error");
                    break;
                }
                if (d <= 20) {
                    System.out.println("Taureau");
                } else {
                    System.out.println("Gémeaux");
                }
                break;
                
            case 6: // Gémeaux : 21/5 au 21/6, Cancer : 22/6 au 22/7
                if (d < 1 || d > 30) {
                    System.out.println("Error");
                    break;
                }
                if (d <= 21) {
                    System.out.println("Gémeaux");
                } else {
                    System.out.println("Cancer");
                }
                break;
                
            case 7: // Cancer : 22/6 au 22/7, Lion : 23/7 au 22/8
                if (d < 1 || d > 31) {
                    System.out.println("Error");
                    break;
                }
                if (d <= 22) {
                    System.out.println("Cancer");
                } else {
                    System.out.println("Lion");
                }
                break;
                
            case 8: // Lion : 23/7 au 22/8, Vierge : 23/8 au 22/9
                if (d < 1 || d > 31) {
                    System.out.println("Error");
                    break;
                }
                if (d <= 22) {
                    System.out.println("Lion");
                } else {
                    System.out.println("Vierge");
                }
                break;
                
            case 9: // Vierge : 23/8 au 22/9, Balance : 23/9 au 22/10
                if (d < 1 || d > 30) {
                    System.out.println("Error");
                    break;
                }
                if (d <= 22) {
                    System.out.println("Vierge");
                } else {
                    System.out.println("Balance");
                }
                break;
                
            case 10: // Balance : 23/9 au 22/10, Scorpion : 23/10 au 22/11
                if (d < 1 || d > 31) {
                    System.out.println("Error");
                    break;
                }
                if (d <= 22) {
                    System.out.println("Balance");
                } else {
                    System.out.println("Scorpion");
                }
                break;
                
            case 11: // Scorpion : 23/10 au 22/11, Sagittaire : 23/11 au 21/12
                if (d < 1 || d > 30) {
                    System.out.println("Error");
                    break;
                }
                if (d <= 22) {
                    System.out.println("Scorpion");
                } else {
                    System.out.println("Sagittaire");
                }
                break;
                
            case 12: // Sagittaire : 23/11 au 21/12, Capricorne : 22/12 au 19/1
                if (d < 1 || d > 31) {
                    System.out.println("Error");
                    break;
                }
                if (d <= 21) {
                    System.out.println("Sagittaire");
                } else {
                    System.out.println("Capricorne");
                }
                break;
                
            default:
                System.out.println("Invalid month");
                break;
        }
        int z = 0;
        return z;
    }
    
}
