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

Exemple de sortie :

Entrée : Mois = 3, Jour = 15
Sortie : "Le signe astrologique est Poissons."

Entrée : Mois = 13, Jour = 10
Sortie : "invalide" 
*/

package excercicess10;
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
    public static int verification(int m, int d){
        
        switch (m) {
            case 1:
            if (d>0 && d<21) {
                System.out.println("Capricorne");
            }else if(d>20 && d<32){
                System.out.println("Poissons");
            }else if(d<0 && d>31){
                System.out.println("entree invalide");
            }
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            default:
            System.out.println("entree invalide");
        }
        int z = 0;
        return z;
    }
    
}
