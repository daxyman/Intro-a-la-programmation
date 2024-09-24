package exercices;

import java.util.Scanner;

public class exercise_3 {
    public static void main(String[] args){
        System.out.print("ecrivez un numero: ");
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        int number1 = Integer.parseInt(input1);

        switch (number1) {
            case 1 :
            System.out.print("Lundi");
                break;
            case 2:
            System.out.print("Mardi");
                break;
            case 3:
            System.out.print("Mercredi");
                break;
            case 4:
            System.out.print("Jeudi");
                break;
            case 5:
            System.out.print("Vendredi");
                break;
            case 6:
            System.out.print("Samedi");
                break;
            case 7:
            System.out.print("Dimanche");
                break;
        
            default:
                break;
        }
        scanner.close();
    }
}
