package personal_notes.java_characters;

public class java_characters {
    public static void main(String[] args){
        notes();
    }
    public static void notes(){
        System.out.println("when you deal with a single character you'd usually go for a char");
        
        char ch = 'a'; 
        // Unicode for uppercase Greek omega character
        char uniChar = '\u03A9';
        // an array of chars
        char[] charArray = { 'a', 'b', 'c', 'd', 'e' };

        System.out.println("this is the first one " + ch);
        System.out.println("this is the second one " + uniChar);
        printcharTable(charArray);
        System.out.println();
        System.out.println("\n There are times, however, when you need to use a char as an object\n for example, as a method argument where an object is expected. \n The Java programming language provides a wrapper class that \"wraps\" the char in a Character object for this purpose. \n An object of type Character contains a single field, whose type is char.\n You can create a Character object with the Character constructor: \n");
        System.out.println("Character ch = new Character('a');");
        System.out.println("\nThe Character class is immutable, so that once it is created, a Character object cannot be changed.");
        System.out.println("\nSo now for the Escape equences (A.K.A what we were looking for) are this");
        System.out.println("\n \\t insert a \t tab in the text");
        System.out.println("\n \\b insert a \bbackscape in the text");
        System.out.println("\n \\n insert a \n new line in the text");
        System.out.println("\n \\r insert a \r carriage return in the text");
        System.out.println("\n \\f insert a \f form feed in the text");
        System.out.println("\n \\' insert a \' single quote character in the text");
        System.out.println("\n \\\" insert a \" double quote character in the text");
        System.out.println("\n \\\\ insert a \\ backlash in the text");
    }
    public static void printcharTable(char[] table){
        for(int i=0;i<table.length;i++){
            System.out.print(table[i]);
        }
    }
    
}
