import java.util.Scanner;

class Number {
    public static void main(String[] args) {
        int whatever = 0;  //establishing value "whatever" as an integer 0
        double number1; // establishing value "number 1" as a double value, meaning it can hold decimals
        double number2;
        Scanner scanner = new Scanner(System.in);

        //first number
        System.out.println("ecrivez un numero:");
        String input1 = scanner.nextLine();  // Read first input

        //second number
        System.out.println("ecrivez un deuxieme numero:");
        String input2 = scanner.nextLine();  // Read second input
        
        System.out.println("ecrivez un troisieme numero:");
        String input3 = scanner.nextLine();  // Read second input

        // convert numbers into Doubles
        number1 = Double.parseDouble(input1); //returns a new double value that is initialized to the value corresponding to defined String
        number2 = Double.parseDouble(input2);
        number2 = Integer.parseInt(input3); // same bs but with an integer

        // Compare the two numbers and print the result
        if (number1 == number2) {
            System.out.println(number1 + " est egal a " + number2);
        } else if (number1 < number2) {
            System.out.println(number2 + " est plus grand que " + number1);
        } else {
            System.out.println(number1 + " est plsu grand que " + number2);
        }

        // Close the Scanner object to prevent resource leaks
        scanner.close();
    }
}
