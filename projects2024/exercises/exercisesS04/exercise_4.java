package exercisesS04;

import java.util.Scanner;

public class exercise_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ecrivez un numero:");
        String input1 = scanner.nextLine();
        int n = Integer.parseInt(input1);

    int[][] tab1 = new int[n+1][n+1];
    for (int i = 1; i < tab1.length ; i++) {
        for (int j = 1; j < tab1[i].length; j++) {
        System.out.print(j + " ");
        }
        System.out.println();
        }

        scanner.close();
    }
}