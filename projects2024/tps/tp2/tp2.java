package tps.tp2;
import java.util.Scanner;
import java.lang.Math;
public class tp2 {
    public static char ezboard[][] = new char[5][5]; //come to think about it, i could just make a single table and resize it
    public static char midboard[][] = new char[10][10];
    public static char possibleSolvdTabValues[] = {'B','F','~'}; //table of possible characters for solved table
    public static int tablsize = 0;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        while (!validInput) {
        optionMenu(); //shows menu
        int diff = scanner.nextInt();
        switch (diff) {
            case 1: // Easy board
                fillezboard();
                char[][] solvedEzBoard = TableSolved(ezboard);
                System.out.println("Solved Easy Board:");
                afficherTableauDouble(solvedEzBoard);
                break;
            case 2: // Medium board
                fillmidboard();
                char[][] solvedMidBoard = TableSolved(midboard);
                System.out.println("Solved Medium Board:");
                afficherTableauDouble(solvedMidBoard);
                break;
            case 3: // Hard board
                fillhardboard(scanner);
                char[][] hardboard = new char[tablsize][tablsize]; // Create custom board
                char[][] solvedHardBoard = TableSolved(hardboard);
                System.out.println("Solved Hard Board:");
                afficherTableauDouble(solvedHardBoard);
                break;
            default:
                System.out.println("not an option");
                break;
        }
    }
        scanner.close();
    }
    public static void afficherTableauDouble(char board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
                tablsize += 1;
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


public static char[][] TableSolved(char[][] board) { 
    char[][] solvedBoard = new char[board.length][board[0].length];
        // Fill board and count occurrences
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) { // Correct loop increment
                char choice = randomChoice();
                solvedBoard[i][j] = choice; // Correct assignment
            }
        }

    return solvedBoard;
}


    public static char randomChoice() { //make a random.math choice, it approximates to be 25% Bombs(B), 45% flowers(F) and 30% empty(~).
        // Generate a random number between 1 and 100
        int rand = (int)(Math.random() * 100) + 1;
        /*I find this to be the best way, others would loop infitly if the number was
        not able to be divided in the percentages, and asked for a margin, this doesnt provide the required
        percentages 100% of the time but it comes close the most times*/
        if (rand <= 45) {
            return 'F'; // 45% chance
        } else if (rand <= 70) {
            return 'B'; // 25% chance
        } else {
            return '~'; // 30% chance
        }
    }
    public static void optionMenu(){
        System.out.println("Bienvue aux Jeu des mines fleuries!");
        System.out.println("Select your difficulty level:");
        System.out.println("1. Facile");
        System.out.println("2. Medium");
        System.out.println("3. Dificile");
    }
    public static void fillezboard(){
        remplirTableauDouble(ezboard);
        afficherTableauDouble(ezboard);
    }
    public static void fillmidboard(){
        remplirTableauDouble(midboard);
        afficherTableauDouble(midboard);
    }
    public static void fillhardboard(Scanner scanner){
        System.out.println("Quelle hauteur que vous voulez?");
        int hardTabLonge = scanner.nextInt();
        System.out.println("Quelle longeur que vous voulez?");
        int hardTabHaut = scanner.nextInt();
        char hardboard[][] = new char[hardTabLonge][hardTabHaut];
        remplirTableauDouble(hardboard);
        afficherTableauDouble(hardboard);
        afficherTableauDouble(hardboard);   
    }
    public static void playGame(){

    }
}