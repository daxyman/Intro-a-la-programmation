/* 2. Somme des chiffres d’un nombre
Objectif : Créer une méthode qui prend un entier en entrée et renvoie la somme de ses chiffres.

•	Exemple : int sommeChiffres(int n)

    Entrée : 123

    Sortie : 6 (1 + 2 + 3) */

//4567/1 = 4567  0
//4567/10 = 456  7
//4567/100 = 45  76
//4567/1000 = 4  765

//How to read last digit of every number?

//4567 - 4560 = 7
//456 - 450 = 6
//45 - 40 = 5
//4 - 0 = 4

//good solution i guess

//
    package exercisesS08;

import java.util.Scanner;

public class excercise2 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez numero a somer");
        int n = scanner.nextInt();
        n=someChiffres(n);
        System.out.println(n);
        scanner.close();
    }
        public static int someChiffres(int n){ 
        // 4567
        //length = 4
        //n% 10^length = n                                                  4567   =i will call this "a" for this example
        //n% 10^length-1 = n minus the first digit                          567    =i will call this "b" for this example
        //n% 10^length-2 = n minus first and second digit                   67     =i will call this "c" for this example
        //n% 10^length-3 = n minus first, second and third digit            7      =i will call this "d" for this example
        //n% 10^length-4 = n minus first, second, third and fourth digit    0      =i will call this "e" for this example

        // print ((n), (a+b+c+d+e), ("a + b + c + d + e") )

        /*
         * this is what it looked like on the final draft (done but unoptimized):
        int length = String.valueOf(n).length();
        int result = 0;
        int potency = 0;
        int sum = 0;
        for(int i=0; i<length+1; potency--, length--){
            potency = (int) Math.pow(10, length);
            result = (n % potency);
            int lastResult = ((result/(potency/10)));
            sum = (sum + lastResult);
        }
        return sum;
         */
        //optimized
        int length = String.valueOf(n).length();
        int potency = (int) Math.pow(10, (length-1));
        int sum = 0;
        for(int i=0; i<length; i++){
            sum = sum + (n /potency)%10;
            potency = (potency/10);
        }
        return sum;
    }
}

