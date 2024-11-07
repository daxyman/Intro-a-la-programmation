package exercisesS03;

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


