package exercisesS08;
/*1. Calculatrice simple
Objectif : Créer des méthodes pour les opérations de base (addition, soustraction, multiplication, division, puissance).

•	Exemple : double addition(double a, double b)
 */
import java.util.Scanner;
public class excercise1 {

public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("number a");
double a = scanner.nextDouble();
System.out.println("number b");
double b = scanner.nextDouble(); 
System.out.println("choisisez");
System.out.println("1 somme");
System.out.println("2 soustraction ");
System.out.println("3 division ");
System.out.println("4 multiplication");
System.out.println("5 puissance");
int option = scanner.nextInt();
scanner.close();
switch (option) {
case 1:
    somme(a, b);
    break;

case 2:
    soustraction(a, b);
    break;
    
case 3:
    division(a, b);
    break;

case 4:
    multiplication(a, b);
    break;

case 5:
    puissance(a, b);
    break;

default:
    break;
}

}
public static double somme(double a, double b){
    double result = (a + b);
    System.out.println(result);
    return result;
}
public static double soustraction(double a, double b){

    double result = (a - b);
    System.out.println(result);
    return result;
}
public static double division(double a, double b){
    double result = (a / b);
    System.out.println(result);
    return result;
}
public static double multiplication(double a, double b){
    double result = (a * b);
    System.out.println(result);
    return result;
}
public static double puissance(double a, double b){
    //a times a, the amount of times b says is so, a loop?
    //a = number to multiply
    //b = number of times something will happen (a will multiply themself/eves?)
    //a^b = a*a .. b amount of times
    double result = 1;
    for(double i=0; i< b;i++){
        result *= a;
    }
    System.out.println(result);
    return result;
}
    
    
}
