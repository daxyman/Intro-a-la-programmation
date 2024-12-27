package personal_notes.tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class howtoTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // this is a code that asks the user to input two numbers to divide them
        while (true) {
            System.out.println();
            System.out.println("enter a number to divide (enter 10 here if you want to escape the matrix)");
            int divident = scanner.nextInt();
            System.out.println("enter the number you want it divided by");
            int divisor = scanner.nextInt();

            System.out.println(divident / divisor);

            if (divident == 10) { // gives a way out
                break;
            }
        }
        System.out.println("\n you've escaped the matrix of the first example!");
        
        // what happens is that if you input a number that's not an int you'll get an error
        // it will likely be InputMismatchException, what can we do about this? code that breaks this easily is not good code

        // We do try-catch of course!
        try {
            System.out.println("\nthis code inside a try, this will be the run that java is trying to run");
        } catch (Exception e) {
            System.out.println("this is the catch statement, when an exception happens, (A.K.A an error)");
            System.out.println("We can specify what kind of exception we want to catch too");
        }

        // A more robust example, adding specific exception handling
        try {
            while (true) {
                System.out.println();
                System.out.println("enter a number to divide");
                int divident = scanner.nextInt();
                System.out.println("enter the number you want it divided by (use 0 for this example to make sense)");
                int divisor = scanner.nextInt();

                System.out.println(divident / divisor);

                if (divident == 10) { // gives a way out
                    break;
                }
            }
        } catch (ArithmeticException e) {
            System.out.println("as you can see clearly, java did not kill itself here, why?");
            System.out.println("Simple! when I entered the catch, I declared that I wanted to catch ArithmeticException, which is the result when you normally try to divide by zero");
        } catch (InputMismatchException e) {
            System.out.println("Oops! You entered something that's not a number. Java caught this InputMismatchException");
            System.out.println("This is how we gracefully handle user input errors");
        } catch (Exception e) {
            System.out.println("This is a generic catch block for any other exceptions that might occur");
            System.out.println("It ensures the program doesn't crash unexpectedly");
        } finally {
            System.out.println("The 'finally' block is here! It always runs, no matter what.");
            System.out.println("We use it for cleanup tasks, like closing scanners.");
            scanner.close();
        }

        System.out.println("\nProgram has exited all the try-catch blocks and completed execution.");
    }
}
