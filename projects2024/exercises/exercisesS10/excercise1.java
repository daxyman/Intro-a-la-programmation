/*
 1. Vérificateur de voyelles
Objectif : Écrire un programme Java qui vérifie si un mot donné contient au moins une voyelle.
Consignes :

Demandez à l’utilisateur de saisir un mot.
Utilisez la méthode charAt() pour parcourir chaque caractère du mot.
Vérifiez si le mot contient au moins une voyelle (a, e, i, o, u, y).
Affichez un message indiquant si le mot contient des voyelles ou non.
Structurez votre code en créant une méthode séparée pour vérifier la présence de voyelles.
Exemple de sortie :

Entrée : "chat"
Sortie : "Le mot contient des voyelles."

Entrée : "pfff"
Sortie : "Le mot ne contient pas de voyelles."
 */
package exercisesS10;
import java.util.Scanner;
public class excercise1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ecrivez un mot: ");
        String n = scanner.nextLine();
    
        //boolean is part of theacher's solution
        boolean rslt = contientVoyelle(n, false);

        //
        if (rslt==true) {
            System.out.println("votre mot contienne une voyelle");
        }else{
            System.out.println("votre mot ne contienne pas une voyelle");
        }
    }
    public static boolean contientVoyelle(String n,boolean rslt){
        for(int i =0; i<n.length();i++){
            /* my solution
            int chekd = n.charAt(i);
            String word = String.valueOf(chekd);
            if(word.equals("a") || word.equals("e")|| word.equals("i")|| word.equals("o")|| word.equals("u")|| word.equals("y")){
                System.out.println("Le mot contient des voyelles");
            }else{
                System.out.println("le mot ne contient pas de voyelles");
            }
            */


            //teacher's first solution
                // char word = n.charAt(i);
                // //a , e, i , o , u
                // if(word == 'a'|| word == 'e' || word == 'i' || word == 'o' || word == 'u' || word == 'u'){
                //    rslt = true;
                // }

            //optimized solution from teach
            char word = n.charAt(i);
            //a, e, i, o , u
            switch (word) {
                case 'a':   
                case 'e':   
                case 'i':   
                case 'o':   
                case 'u':   
                case 'y':
                rslt = true;   
            }
            }
        return rslt;
        }
}
