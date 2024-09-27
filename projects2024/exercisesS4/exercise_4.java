package exercisesS4;

import java.util.Scanner;

public class exercise_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        System.out.println("ecrivez un numero:");
        String input1 = scanner.nextLine();
        n = Integer.parseInt(input1);

    int[][] tab1 = new int[n][n];
    for (int i = 0; i < n ; i++) {
        for (int j = 0; j < n; j++) {
        System.out.print(tab1[i][j] + " ");
        }
        System.out.println();
        }

        scanner.close();
    }
}