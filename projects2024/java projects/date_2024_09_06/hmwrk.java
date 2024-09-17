import java.util.Scanner;

/**
 * hmwrk
 */
    public class hmwrk {
        public static void main(String []args ) {
            int number1 = 0;
            int number2 = 0;
            int operation = 0;

            Scanner scanner = new Scanner(System.in);

                System.out.println("numero1");
                String input1 = scanner.nextLine();
                
                System.out.println("numero2");
                String input2 = scanner.nextLine();
                
                System.out.println("operation \n 1 addition \n 2 substraction \n 3 power \n 4 division");
                String input3 = scanner.nextLine();


            number1 = Integer.parseInt(input1);
            number2 = Integer.parseInt(input2);
            operation = Integer.parseInt(input3);
            int result = 0;
            

            switch (operation) {
                case 1:
                // addition
                result = number1 + number2;
                System.out.println("result is = "+result);
                break;
                case 2:
                //substraction
                result = number1 - number2;
                System.out.println("result is = "+result);
                break;
                case 3:
                //power
                result = (int) Math.pow(number1, number2);
                System.out.println("result is = "+result);
                break;
                case 4:
                //division
                result = number1 / number2;
                System.out.println("result is = "+result);
                break;
            }
            scanner.close();
        }
    
}