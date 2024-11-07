package exercicesS02;

import java.util.Scanner;

public class exercise_5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("entrez une note: ");
        String input1 = scanner.nextLine();
        int number1 = Integer.parseInt(input1);
        
        if (number1 >=90) { 
            System.out.println("A");
        }else if (number1 >= 80) {
            System.out.println("B");
        }else if (number1 >= 70) {
            System.out.println("C");
        }else if (number1 >= 60) {
            System.out.println("D");
        }else if (number1 < 60) {
            System.out.println("F");
        }
        scanner.close();
    }
}
