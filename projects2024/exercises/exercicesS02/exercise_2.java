    package exercicesS02;

import java.util.Scanner;

public class exercise_2 {
    public static void main(String[] args){
        System.out.print("Votre âge: ");
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        int number1 = Integer.parseInt(input1);

        if(number1 < 12){
            System.out.print("vous êtes un enfant");
        }else if(number1 <=17){
            System.out.print("vous êtes un adolescent");
        }else if(number1 <=64){
            System.out.print("vous êtes un adulte.");
        }else if(number1 > 65){
            System.out.print("vous êtes un senior.");
        }
        scanner.close();
    }
}
