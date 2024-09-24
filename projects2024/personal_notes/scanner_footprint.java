package personal_notes;

import java.util.Scanner; //case sensitive (VERY IMPORTANT)

public class scanner_footprint {

public class exercise_2 {
    public static void main(String[] args){
        System.out.println("ecrivez un numero:");
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        int number1 = Integer.parseInt(input1);

        System.out.print(number1);

        scanner.close();
    }
}
}
