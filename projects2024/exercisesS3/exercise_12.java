package exercisesS3;

import java.util.Scanner;

public class exercise_12 {
    
    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        int randomNumber = (int) (Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess = 0;

        System.out.println("devinez entre 1 et 100");

        // Loop until the user guesses the correct number
        while (guess != randomNumber) {
            System.out.print("guess: ");
            guess = scanner.nextInt();

            if (guess < randomNumber) {
                System.out.println("plus haut.");
            } else if (guess > randomNumber) {
                System.out.println("plus bas.");
            } else {
                System.out.println("yay!: " + randomNumber);
            }
        }

        scanner.close();
    }
}

