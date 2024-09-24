package date_2024_09_24;

import java.util.Scanner;

import java.util.ArrayList;

public class aideReussite {
    public static void main(String[] Args){

            //ask the user for 10 notes
            //store them in a table
            //show the table

        int[] notes ={};
        for(int i=1; i<=10; i++){
            System.out.print("entrez une note: ");
            Scanner scanner = new Scanner(System.in);
            String input1 = scanner.nextLine();
            int number1 = Integer.parseInt(input1);

            scanner.close();

        }

    }
    
}
