package projects2024.personal_notes.java_methods;

public class notes {
//public static void main(String[] args){
//}


/*  
    afficherMessageAccueil doesn't take any parameter nor does it send anything.
    she sends back a simple task, (show a message) 
*/
public static void afficherMessageAccueil(){
    System.out.println("Hello world");
}


/* 
    * saluerUtilisateur (String nom) takes a parameter (user name) for personalizing 
    the print, but doesn't send back anything
    * The method uses the argument to personalize it's execution
*/
public static void saluerUtilisateur(String nom) {
    System.out.println("Bonjour " + nom + "!");
}

/*
    * MessageAnniversaire2 (String nom, int age) takes two parameters ( user name, their age), but returns nothing
    * The parametres are listed in parenthesis, always with the same syntax (type variablename) and separated by a coma (,)
    * The method can list as many parameters as needed
    */
public static void MessageAnniversaire2 (String nom, int age){
    System.out.println("Joyeux anniversaire" + nom + ", felicitation pour tes " + age + "ans !!!");
}
/*
    * Here,the method genererNombreAleatorie() returns a value, but takes no parameter.
    * 
    * It is useful when we want the method to give a result back when having no need for external data
    * The return allows to return a value by calling the method
    */
public static int genererNombreAleatorie(){
    //makes up a number between 0 and 99
    int number = (int) (Math.random() * 100);
    return number;
}

// Methods with Return Values
// Methods that return a value must be handled when called in order to use that value.

public static void main(String[] args) {
    // Call the method genererNombreAleatoire()
    // Process the return (random number)
    int result = genererNombreAleatoire();
}

public static int genererNombreAleatoire() {
    // Generates a number between 0 and 99
    int number = (int) (Math.random() * 100);
    return number; // Returns the generated number
}

// Methods with Parameters and Return
// These methods receive data as input and return a result, promoting code reuse.

public static int addIntegers(int a, int b) {
    int sum = a + b; // Calculate the sum of the two numbers
    return sum; // Returns the sum
}

// Complete Example
public class TriangleApp {
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
