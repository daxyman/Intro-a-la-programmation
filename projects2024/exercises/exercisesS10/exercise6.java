/*
6. Générateur de mots de passe
Objectif : Écrire une méthode Java qui génère aléatoirement des mots de passe ayant les caractéristiques suivantes.
Consignes :
Un mot de passe doit avoir une taille comprise entre 6 et 10 caractères.

Un mot de passe doit avoir au moins :
Un chiffre
Deux lettres majuscules
Une lettre minuscule
Un seul caractère spécial parmi : ;, _, ?, $, !

Créez une méthode static String genererMotDePasse() pour générer le mot de passe.
Utilisez les classes Random et StringBuilder pour construire le mot de passe.

Exemple de sortie :

Sortie possible : "A9b_R4"
Ces exercices vous permettent de pratiquer plusieurs concepts en Java tels que la manipulation de chaînes de caractères,


la gestion des conditions, et l'utilisation de méthodes. Assurez-vous de bien structurer votre code en suivant les bonnes pratiques enseignées en classe.
Je vous rappelle que les notions acquises lors des exercices peuvent être sujettes à examen. 
Je vous encourage donc fortement à faire tous les exercices pour vous préparer à l'examen 02.
*/
package exercisesS10;
import java.util.Random; //this is so that i can use Random, as asked by the teacher 
import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        //declare classes, make instances
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        //code starts
        System.out.println("combien de caracteres dans votre mot de passe (minimum 5)?");
        int longitude = scanner.nextInt();

        //checks the password has a minimum of 5, since it fits all requirements
        while (longitude < 5) {
            System.out.println("password must be at least 5 characters");
            longitude = scanner.nextInt();
        }
        scanner.close(); //no more input necessary

        //prints password
        System.out.println(genererMotDePasse(longitude, random));
        //code ends
    }

    public static String genererMotDePasse(int longitude, Random random) {
        String password; //declare password variable to store final password
        
        //do-while loop to keep generating until the password meets the specified length
        do {
            //declaring what are the necessary combination of characters
            String special = ";_?$!"; //only one
            String minuscule = "sphynxofblackquartzjudgemyvow"; // at least 1
            String majuscule = minuscule.toUpperCase(); //at least 2
            String numbers = "1234567890"; //at least 1
            //list containing all Strings with mandatory characters
            String[] list = {numbers, minuscule, majuscule, special};
            //no more characters are neccessary

            //define how many chars to pull from each respective String
            int[] mincharsToPull = {1, 1, 2}; //this will be minuscule, majuscule and numbers. They are a minimumm, so they can contain more than this but not less
            int fixedCharsToPull = 1; //this will be special. This is a set amount, so it will always be the same
            //only two conditions we need

            //StringBuilder to build the password as we add characters
            StringBuilder passwordBuilder = new StringBuilder(); //stores password characters

            //loop through each list element and apply character selection rules
            for (int i = 0; i < list.length; i++) {
                String chosenOne = list[i]; //this will go through the lists in order
                int numCharsToPull; //we declare a variable that will set how many chars are necessary for any given String

                //picks the last string to give it the given amount
                if (i == list.length - 1) {
                    numCharsToPull = fixedCharsToPull; //set numCharsToPull to fixed amount for special chars
                } else {
                    int minNumCharsToPull = mincharsToPull[i]; //retrieve minimum for current String
                    numCharsToPull = minNumCharsToPull + random.nextInt(chosenOne.length() - minNumCharsToPull + 1); //calculate actual amount to pull (min to full length)
                }

                //loop to pull each random character as per numCharsToPull
                for (int j = 0; j < numCharsToPull; j++) {
                    int randomIndex = random.nextInt(chosenOne.length()); //generate random index for the current String
                    char randomChar = chosenOne.charAt(randomIndex); //retrieve character at random index
                    passwordBuilder.append(randomChar); //append character to password
                }
            }

            //convert StringBuilder to String and store in password variable
            password = passwordBuilder.toString();
        } while (password.length() != longitude); //repeat if password length does not match longitude

        return password; //return the generated password
    }
}


//return the generated password as a string



    
/* this is an explanation on random basically, how to use random to pull from a string

//this generates a random number within "special" String length(a position inside a string/Table/int/whatever else is called an index), so if "special" was 10 characters, it would chose a number from 1-10
    int randomindex = random.nextInt(special.length());

    //this picks a random character based on the number that randomindex made, so if randomindex generates the number "2" it will pick the second number in the String
    char randomSpecialChar = special.charAt(randomindex);

*/

/*

    i didnt saw it needed all 5 so fuck this

    //for it to make a password with the length that we want (longitude) we make a for loop that adds until it reaches "longitude"'s length'
    while(true){
    
    //since we already have the length that we want and also the mandatory characters, we can start by making a stringbuilder with "longitude"'s length'
    //we put it inside the while statement, so that it does it again if it contains no required characters
    StringBuilder randomSequence = new StringBuilder(longitude);
    for (int i = 0; i < longitude; i++) {

        // Select a random character in the requirements string
        int randomCharacter = random.nextInt(totalCharacters.length());
        
        // insert the randomly chosen character into the sequence
        randomSequence.append(totalCharacters.charAt(randomCharacter));
    }
    //make randomsequence into a String, then returning it
    if (containsAnyRequiredCharacter(randomSequence.toString(), requirements)) {
        return randomSequence.toString(); // Return the valid password
    }
    return randomSequence.toString();
}
 
    
}
public static boolean containsAnyRequiredCharacter(String randomSequence, String requirements) {
    for (int i = 0; i < requirements.length(); i++) {
        if (randomSequence.indexOf(requirements.charAt(i)) != -1) {
            return true; // Return true if any required character is found
        }
    }
    return false; // Return false if none of the required characters are found
}
}
*/