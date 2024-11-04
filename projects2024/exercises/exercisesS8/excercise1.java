package exercisesS8;
/*1. Calculatrice simple
Objectif : Créer des méthodes pour les opérations de base (addition, soustraction, multiplication, division, puissance).

•	Exemple : double addition(double a, double b)
 */
import java.util.Scanner;
public class excercise1 {

    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    scanner.close();
    int option = scanner.nextInt();
    switch (option) {
        case 1:
            somme();
            break;
    
        case 2:
            
            break;
    
        case 3:
            
            break;
    
        case 4:
            
            break;
    
        default:
            break;
    }

    }
    public static double somme(double a, double b){
        double result = a + b;
        System.out.println(result);
        return result;
    }
    public static double soustraction(double a, double b){

        double result = a - b;
        return result;
    }
    public static double division(double a, double b){
        double result = a / b;
        return result;
    }
    public static double multiplication(double a, double b){
        double result = a * b;
        return result;
    }
    public static double Puissance(double a, double b){
        double result = a + b; //a times a, the amount of times b says is so, a loop?
        for (double i=0 ;i<b; i++){
            System.out.println(i * a);
        }
        return result;

    }
    
    
}
