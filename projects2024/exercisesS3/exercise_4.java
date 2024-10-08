package exercisesS3;

<<<<<<< HEAD
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
=======
import java.text.DecimalFormat;

import java.util.Scanner;

public class exercise_4 {
    public static void main(String[] args) {
    DecimalFormat df = new DecimalFormat("#.00");
    Scanner scanner = new Scanner(System.in);
        
        System.out.println("entrez une quantite de notes a verifier");
        String input1 = scanner.nextLine();
        int number1 = Integer.parseInt(input1);

        double[] tab1 = new double[number1];
        for (int i = 0; i < number1; i++) {
            double random1 = Math.random() * 100; // Generate a random number between 0 and 100
            tab1[i] = random1; // Store the random number in the array
            System.out.println(df.format(tab1[i])); // Print the rounded number
            // System.out.println(String.format("%.2f", random1)); 
            //double roundedValue = Math.round(random1 * 100.0) / 100.0; // Round to 2 decimals
            //System.out.println(df.format(roundedValue)); // This rounds the numbers to 2 decimals
        }
        double total = 0.0;
        for (double note : tab1){
            total += note;
        }
        System.out.println("Total: " + df.format(total));
        scanner.close();
    }
}


>>>>>>> 83076c4e4b2c0b6917beb79f9b58ccff69a5d7b9
