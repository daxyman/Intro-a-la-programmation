package tps.tp2;
import java.util.Scanner;
public class tp2 {
    public static char ezboard[][] = new char[5][5]; 
    public static char midboard[][] = new char[10][10];
    public static char possibleSolvdTabValues[] = {'B','F','~'}; //table of possible characters for solved table
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        optionMenu();
        int diff = scanner.nextInt();

        switch (diff) {
            case 1://ezboard
                remplirTableauDouble(ezboard);
                afficherTableauDouble(ezboard);
                break;
        
            case 2://midboard
                remplirTableauDouble(midboard);
                afficherTableauDouble(midboard);
                break;
        
            case 3://hardboard
                System.out.println("Quelle hauteur que vous voulez?");
                int hardTabLonge = scanner.nextInt();
                System.out.println("Quelle longeur que vous voulez?");
                int hardTabHaut = scanner.nextInt();
                char hardboard[][] = new char[hardTabLonge][hardTabHaut];
                remplirTableauDouble(hardboard);
                afficherTableauDouble(hardboard);
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
    public static void TableSolved(char[][] board) { //make a copy of board and fill it random indicators. As the user enters coordenates, it will replace the given value with the one of the solved table
        char[][] solvedBoard = new char[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                solvedBoard[i][j] = 0; //how can i turn this into "either 'b', 'f' or '~' "
            }            
        }
    }
    public static void optionMenu(){
        System.out.println("Bienvue aux Jeu des mines fleuries!");
        System.out.println("Select your difficulty level:");
        System.out.println("1. Facile");
        System.out.println("2. Medium");
        System.out.println("3. Dificile");
    }
    
}