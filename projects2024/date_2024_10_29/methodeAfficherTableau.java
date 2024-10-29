package projects2024.date_2024_10_29;

public class methodeAfficherTableau {
    public static void main(String[] args) {
        int[] monTableau = {1,2,3};
        modifiertableau(monTableau);
        for (int i: monTableau){
            System.err.println(i+" "); //affichera: 10 2 3
        }
    }
    public static void modifiertableau(int[] tableau){
        tableau[0] = 10; //modification du PREMIER élément
    }
    
}
