package finalExamPrep;
import java.util.InputMismatchException;
import java.util.Scanner;
public class trying {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        try {
            switch (number) {
                case 1:
                    System.out.println("hi");
                    break;
                case 2:
                System.out.println("hello");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter 1 or 2.");
            }
        } catch (InputMismatchException e) {
            System.err.println("Invalid input detected in picker!");
            scanner.nextLine(); // Clear invalid input
        }
    }
    public static void menu() {
        Scanner scanner2 = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");
            try {
                int number = scanner2.nextInt(); // Move this inside the try block
                switch (number) {
                    case 1:
                        System.out.println("hi");
                        break;
                    case 2:
                        System.out.println("hello");
                        break;
                    default:
                        System.out.println("Invalid choice! Please enter 1 or 2.");
                }
            } catch (InputMismatchException e) {
                System.err.println("Invalid input detected! Please enter a number.");
                scanner2.nextLine(); // Clear the invalid input
            }
        }
    }
    
}

    


