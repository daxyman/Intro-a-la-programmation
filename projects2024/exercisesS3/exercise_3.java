package exercisesS3;

import java.util.Scanner;

public class exercise_3 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
        System.out.print("combien numeros voulez vous entrer: ");
        String input1 = scanner.nextLine();
        
        int number1 = Integer.parseInt(input1);

        double[] table = new double[number1];

        for(int i=0; i < number1; i++){
            System.out.print("entrez numero " + (i+1) + ": ");
            String input2 = scanner.nextLine();
            double number2 = Double.parseDouble(input2);
            table[i] = number2;
        }
        scanner.close();

        System.out.print("les chiffres sont: ");
        for(int i=0; i < table.length ; i++){
            System.out.print(table[i]+", ");
            System.out.println();
        }
    }
}

