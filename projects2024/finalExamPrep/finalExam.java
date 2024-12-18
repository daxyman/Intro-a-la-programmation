package finalExamPrep;

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
        Scanner scanner = new Scanner(System.in);
        subjects(scanner);

    }
    public static String content(){
        String text = "hello!";
        return text;
    }
    public static void subjects(Scanner scanner) {
        System.out.println("there are 2 things you need to focus on");
        System.out.println("1: String Builder");
        System.out.println("2: java file");
        System.out.println("choose one!");
        int choice = scanner.nextInt();
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
            System.out.println(howStringBuilderWorks());
            break;
            case 2:
            System.out.println(howjavaFileWorks());
            break;
        }

    }
    public static String howStringBuilderWorks(){
        String descriptionStrBuld = "StringBuilder in Java represents a mutable sequence of characters.\nBut what even is a \"mutable sequence of characters\" you migth ask?";
        return(descriptionStrBuld);
    }
    public static String howjavaFileWorks(){
        String descriptionjavFile = "d";
        return(descriptionjavFile);
    }
    
}
