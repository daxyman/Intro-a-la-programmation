package date_2024_12_06;

public class examen {
    public static void main(String[] args){
        int hauteur=5;
        for(int ligne = 0; ligne < hauteur; ligne++ ){
            for(int esp =0; esp < hauteur - ligne - 1; esp++){
                System.out.print(" ");
            }
            for(int etoile =0; etoile <(2*ligne + 1); etoile++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void boucleimbriquee(){
        int[][] matrice = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0; i<matrice.length; i++){
            for(int j=0; j<matrice[i].length;j++){
                if(matrice[i][j] % 2 ==0){
                    System.out.println(matrice[i][j] + " ");
                }
            }
        }
        System.out.println();
    }
    public static void anotherone(){
        //message
        String message = "c'est tres affaidi belle!"; //cette faible voix
        //appel
        String decodage = decodermessage(message);
        }
    public static String decodermessage(String decodage){
        String resultat = "";
        //loop that deletes every 2nd character
    }   
    //she said you need to investigate string.split(); 
}
