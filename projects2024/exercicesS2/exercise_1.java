package exercicesS2;

import java.util.Scanner;

public class exercise_1 {
    public static void main(String[] args){
        System.out.println("ecrivez un numero:");
        
        Scanner scanner = new Scanner(System.in);
        
        String input1 = scanner.nextLine();
        
        int number1 = Integer.parseInt(input1);
        

        if ((number1 % 2) ==0) {
            System.out.println(number1 + " est pair ");
        } else{
            System.out.println(number1 + "est impair");
        }
        scanner.close();
    }
}

