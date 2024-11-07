// to be honest this was pretty much an overkill but i had fun messing around with the loops
package exercisesS03;

import java.util.Random;

public class exercise_1 {

    public static void main(String[] args){

        Random rand = new Random();                     // this calls for the random function, which just makes up a number between x and y values
        int random = rand.nextInt(1000);       //  name "random1"  a number between 1 and 1000


        int[] table1 = new int[10];

        for(int i=0;i<table1.length;i++){
            int random1 = (int)(Math.random()* (100 + 1));// save the integral "random", make a random number between 0 and 0.999.., multiply it by 100 (and add 1 for convenience)
            table1[i] = random1;
            //System.out.println("Random number " + (i + 1) + ": " + random1);
          }
          int evenCount=0;
          int oddCount=0;
        for(int i = 0; i < table1.length;i++){
            if(table1[i]%2==0){
//                System.out.println("even : " + table1[i]); 
                evenCount++;
        } else{
                System.out.println("odd : " + table1[i]); 
                oddCount++;
            }

        }

        System.out.println("there are "+evenCount+" even numbers");
        System.out.println("there are "+oddCount+" odd numbers");
        

    }
}