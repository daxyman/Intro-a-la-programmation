package personal_notes;

import java.util.ArrayList;

public class dinamic_data_structure {
    

ArrayList<Integer> variables = new ArrayList<>();  // Creates a dynamic list

// Assume we're adding values dynamically in a loop, without knowing the total number
for (int i = 0; /* some condition */; i++) {
    // You can add as many elements as needed
    variables.add(i * 10);

    // Stop condition for this example
    if (i == 10) break;  // You would replace this with a real condition
}


// Now print all the values stored
for (int j = 0; j < variables.size(); j++) {
    System.out.println("Variable " + j + ": " + variables.get(j));
}
    
}
