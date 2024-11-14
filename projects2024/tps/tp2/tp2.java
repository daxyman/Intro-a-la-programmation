package tps.tp2;
import java.util.Scanner;
public class tp2 {
    public static char hardboard[][] = new char[1][1];//custom size
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvue aux Jeu des mines fleuries!");
        System.out.println("Select your difficulty level:");
        System.out.println("1. Facile");
        System.out.println("2. Medium");
        System.out.println("3. Dificile");
        int diff = scanner.nextInt();

        switch (diff) {
            case 1://ezboard
                char ezboard[][] = new char[5][5];
                remplirTableauDouble(ezboard);
                afficherTableauDouble(ezboard);
                break;
        
            case 2://midboard
                char midboard[][] = new char[10][10];
                remplirTableauDouble(midboard);
                afficherTableauDouble(midboard);
                break;
        
            case 3://hardboard
                System.out.println("Quelle longeur que vous voulez?");
                int longe = scanner.nextInt();
                System.out.println("Quelle hauteur que vous voulez?");
                int haut = scanner.nextInt();
                char hardboard[][] = new char[longe][haut];
                break;
        
            default:
                break;
        }
    }
    public static void afficherTableauDouble(char board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static char[][] remplirTableauDouble(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = 'X';
            }
        }
        return board;
    }
    
    
}