package date_2024_09_27;

import java.util.Scanner;

public class aideReussite {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] notes = new int[10];

        for(int i= 1; 1<10; i++){
            System.out.print("entrez la note: " + i);
            int n = scanner.nextInt();
            notes[i-1] = n;
        }
        System.out.print("notes");
        scanner.close();
    }   
}

