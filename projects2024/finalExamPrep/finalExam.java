package finalExamPrep;

import java.util.InputMismatchException;
import java.util.Scanner;
public class finalExam {
    public static void main (String[] args){
        /* there are some things i need to get down for my exam, some of my weaker areas will be covered here
         * 
         * I think I should focus on stringBuilder and file
         * 
         * MAIN THINGS TO COMPLETELY DOMINATE:
         * import java.io.File;
         * import java.io.FileWriter;
         * import java.io.IOException;
         * Stringbuilder
         * 
         */
        while(true){
            Scanner scanner = new Scanner(System.in);
            subjects(scanner);
        }
    }
    public static void subjects(Scanner scanner) {
        System.out.println("there are 2 things you need to focus on");
        System.out.println("1: String Builder");
        System.out.println("2: java file");
        System.out.println("choose one!");
        int choice = -1;
        try{
        choice = scanner.nextInt();}
        catch(InputMismatchException e){
            System.err.println("Dumbass tryna enter a letter lmao");
            scanner.nextLine();
            subjects(scanner);
        }
        picker(choice);
    }
    public static void picker (int choice){
        switch(choice){
        /* vsc proposed this
         * case 1 -> howStringBuilderWorks();
         * case 2 -> howjavaFileWorks();
         * i didnt know you could write switch like this tbh
         */
            case 1:
            howStringBuilderWorks();
            break;
            case 2:
            howjavaFileWorks();
            break;
        }
    }
    
    public static void howStringBuilderWorks(){
        System.out.println("\nStringBuilder in Java represents a mutable sequence of characters.\n\nBut what even is a \"mutable sequence of characters\" you migth ask? \n\n it is actually very simple, a mutable sequence of characters allows you to modify the sequence of characters without creating a new object to make a change\n");
        
        System.out.println("We can see here how unmutable sequences of characters normally work:\n");
        String str ="hello";
        System.out.println("original String: " + str);

        //concatenating "word" to the string "str"

        String modifiedStr = str + " world";
        System.out.print ("modified String: " + modifiedStr);

        //keeps the reference
        System.out.println("\nOriginal String reference remains the same: " + str + "\n");

        System.out.println("And now we can see how mutable sequences of characters would work (StringBuilder)\n");
        StringBuilder name = new StringBuilder("hello");
        System.out.println("original StringBuilder: " + name +"\n");
        //append the word "world" to stringbuilder
        name.append(" world");
        System.err.println("Modified Stringbuilder: " + name);
        //see the result
        System.out.println("StringBuilder reference is now changed " + name + "\n");
        System.err.println("When you modify a StringBuilder (e.g., using .append(), .insert(), .delete(), etc.), the changes happen directly to the same StringBuilder object. No new object is created. This is what makes StringBuilder a mutable sequence of characters.");
    }
    public static void howjavaFileWorks(){
        String descriptionjavFile = "d";
    }
    
}