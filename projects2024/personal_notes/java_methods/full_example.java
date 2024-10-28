package projects2024.personal_notes.java_methods;

public class full_example {
    // Complete Example
public static void main(String[] args) {
    // Call the method to display a triangle of random size
    String triangle = displayRandomSizeTriangle();
    // Display the generated triangle
    System.out.println("Here is the generated triangle:");
    System.out.println(triangle);
}

// Method that displays a triangle with a random size
public static String displayRandomSizeTriangle() {
    // Call the method to generate a random integer
    int size = genererNombreAleatoire();
    StringBuilder triangle = new StringBuilder(); // Use StringBuilder to construct the triangle
    
    for (int i = 1; i <= size; i++) {
        for (int j = 0; j < i; j++) {
            triangle.append("*"); // Add stars to each line
        }
        triangle.append("\n"); // Move to the next line after each line of stars
    }
    
    return triangle.toString(); // Returns the triangle as a string
}

public static int genererNombreAleatoire() {
    // Generates a number between 0 and 99
    int number = (int) (Math.random() * 100);
    return number; // Returns the generated number
}
}

}