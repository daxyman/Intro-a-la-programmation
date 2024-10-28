package projects2024.date_2024_10_25;

import java.util.Scanner;

public class convertirEnFahrenheit {
    public static void convertirEnFahrenheitt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une température en degrés Celsius: ");
        
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        
        System.out.println("La température en Fahrenheit est: " + fahrenheit);
        
        scanner.close();
    }
}
