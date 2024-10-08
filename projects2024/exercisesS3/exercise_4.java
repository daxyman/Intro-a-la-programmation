package exercisesS3;

import java.util.Scanner;

public class exercise_4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Combien de numéros voulez-vous entrer: ");
        String input1 = scanner.nextLine();
        int number1 = Integer.parseInt(input1); // Convert input to integer

        double[] table = new double[number1]; // Initialize the array

        // Loop to collect user input
        for(int i = 0; i < number1; i++){
            System.out.print("Entrez numéro " + (i + 1) + ": "); // Corrected the index display
            String input2 = scanner.nextLine();
            double number2 = Double.parseDouble(input2); // Convert input to double
            table[i] = number2; // Store the input in the array
        }
        
        // Print the array contents
        System.out.println("Voici les numéros que vous avez entrés: " + Arrays.toString(table));
        
        scanner.close(); // Close the scanner
    }
}
