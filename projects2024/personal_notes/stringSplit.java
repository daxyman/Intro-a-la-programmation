package personal_notes;

import java.util.Arrays;

public class stringSplit {
public static void main(String[] args){
String myStr = "Split a string by spaces, and also punctuation.";
String regex = "[,\\.\\s]";
String[] myArray = myStr.split(regex);
    for (String s : myArray) {
    System.out.println(s);
    }


String str = "Java is fun";
String[] parts = str.split(" ");
System.out.println(Arrays.toString(parts));
// Output: [Java, is, fun]


String str1 = "apple,banana,orange";
String[] parts1 = str1.split(",");
System.out.println(Arrays.toString(parts1));
// Output: [apple, banana, orange]

String str2 = "one:two:three:four";
String[] parts2 = str2.split(":", 3);
System.out.println(Arrays.toString(parts2));
// Output: [one, two, three:four]

String str3 = "one,two;three four";
String[] parts3 = str3.split("[,; ]");
System.out.println(Arrays.toString(parts3));
// Output: [one, two, three, four]

String str4 = "www.google.com";
String[] parts4 = str4.split("\\.");
System.out.println(Arrays.toString(parts4));
// Output: [www, google, com]

}
    
}
