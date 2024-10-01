package exercisesS4;

import java.util.Scanner;

public class exercise_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ecrivez un numero:");
        String input1 = scanner.nextLine();

        System.out.print("entrez un deuxième numéro: ");
        String input2 = scanner.nextLine();

        int number1 = Integer.parseInt(input1);
        int number2 = Integer.parseInt(input2);

    int[][] tab1 = new int[number1][number2];
    for (int i = 1; i < tab1.length ; i++) {
        for (int j = 1; j < tab1[i].length; j++) {
        System.out.print(tab1[i][j] + " ");
        }
        System.out.println();
        }

        scanner.close();
    }
}
