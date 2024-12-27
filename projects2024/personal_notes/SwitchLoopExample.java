package personal_notes;

import java.util.Scanner;

public class SwitchLoopExample {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
boolean keepRunning = true;
System.out.println("was poppin");

while (keepRunning) {  // loop that keeps running until u say otherwise
    System.out.println("Choose an option (1, 2, or 3). Press 4 to quit.");
    int choice = scanner.nextInt();

    switch (choice) {
        case 1:
            System.out.println("You chose option 1.");
            // code for option 1
            break;

        case 2:
            System.out.println("You chose option 2.");
            // code for option 2
            break;

        case 3:
            System.out.println("You chose option 3.");
            // code for option 3
            break;

        case 4:
            System.out.println("Exiting...");
            keepRunning = false;  // set loop condition to false to break out
            break;

        default:
            System.out.println("Invalid choice, try again.");
            break;
    }
}
scanner.close();
}
}

