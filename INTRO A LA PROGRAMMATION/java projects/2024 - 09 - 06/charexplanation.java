public class charexplanation {
    public static void main(String []args ) {
        //declare a size 10 table that contains simple characters, naming each of them individually
        char[] letter = new char [10]; //here i state beforehand the size of the table "[10]" so the table is only expecting 10 values
        letter[0] = 'A';
        letter[2] = 'B';
        letter[9] = 'J';
        
        
        //declare a size 10 table that contains simple characters, naming each of them in a single line
        char[] letter2 = {'a','b','c','d','d','e','f','g','h','i','j',}; //here i dont give the table a size, so i can just keep on adding stuff
        
        

        //this stores the size of the table "size" as a value called "size"
        int size = letter.length; 

        // set this as a comment so it wont mess witht the rest of the thing, but this essentially prints whatever the size of the table is as a number, in this case it being 10
        // System.out.println(letter.length);
        
        //for loop that will go through the whole table
        for (int i=0; i<letter2.length; i++) {
            System.out.println("the position "+letter2[0]+" holds the value: "+letter2[2]); //play w this man
    }
    int[]table = new int[5]; //this is an int table, i can not write letters or words, it is only and exclusively for numbers
    table[2] = 10;
    table[0] = 1;
    for (int w=1; w>=0; w++){
        System.out.println(w);
    }

}
}
