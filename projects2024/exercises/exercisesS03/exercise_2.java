package exercisesS03;

public class exercise_2 {
    public static void main(String[] args){
        int[] table1= new int [10];
        for(int i=0;i<table1.length;i++){
            int random1 = (int)(Math.random()* (100 + 1));// save the integral "random", make a random number between 0 and 0.999.., multiply it by 100 (and add 1 for convenience)
            table1[i] = random1;
            System.out.println(table1[i]);
            //System.out.println("Random number " + (i + 1) + ": " + random1);
          }
          int max = table1[0]; // Assume the first element is the largest initially
          for (int i = 1; i < table1.length; i++) {
              if (table1[i] > max) {
                  max = table1[i]; // Update max if the current element is larger
            }
        }
        System.out.println("The biggest number in the array is: " + max);
    }
 
}
