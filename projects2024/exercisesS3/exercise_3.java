package exercisesS3;

import java.util.Scanner;

public class exercise_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] table1 = new double[10];
        
        // Use an double for the loop index
        for (int i = 0; i < table1.length; i++) {
            double random1 = Math.random() * (100 + 1); // Generate a random number between 0 and 100
            table1[i] = random1;
        }
        
        scanner.close();
    }
}
 
