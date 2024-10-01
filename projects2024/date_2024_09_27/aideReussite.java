package date_2024_09_27;

import java.util.Scanner;

public class aideReussite {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] notes = new int[10];

        // Loop to collect notes from user input
        for(int i = 1; i < 10; i++) {
            System.out.print("entrez la note " + i + ": ");
            int n = scanner.nextInt();
            notes[i-1] = n;  // Store the input in the correct index
        }

        // Print the word "Notes:" and display the array content
        System.out.print("Notes: ");
        for(int i = 0; i < notes.length; i++) {
            System.out.println("Note " + (i + 1) + ": " + notes[i]);
        }

        scanner.close();
    }
}

