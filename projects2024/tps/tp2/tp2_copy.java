package tps.tp2;
import java.util.Scanner;

import javax.swing.plaf.TreeUI;

import java.lang.Math;
public class tp2_copy {
    public static char possibleSolvdTabValues[] = {'B','F','~'}; //table of possible characters for solved table
    public static int tablsize = 0;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        optionMenu(); //shows menu
        int diff = scanner.nextInt();
        switch (diff) {
            case 1://ezboard
                fillezboard();
                break;
            case 2://midboard
                fillmidboard();
                break;
            case 3://board
                fillboard(scanner);
                break;
            default:
            System.out.println("not an option");
                break;
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
        boolean validTable = false;
    
        while (!validTable) {
            // Fill the board with random choices
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    solvedBoard[i][j] = randomChoice();
                }
            }
            // Check if the generated table meets the expected proportions
            validTable = variableVerification(solvedBoard);
        }
        return solvedBoard; // Return the valid table
    }
    public static char randomChoice() { //make a random.math choice, it must be 25% Bombs(B), 45% flowers(F) and 30% empty(~).
        // Generate a random number between 1 and 100
        int rand = (int)(Math.random() * 100) + 1;
        // Map random numbers to probabilities
        if (rand <= 45) {
            return 'F'; // 45% chance
        } else if (rand <= 70) {
            return 'B'; // 25% chance
        } else {
            return '~'; // 30% chance
        }
    }
    public static boolean variableVerification(char[][] solvedBoard) {
        boolean validContents = true;
        double emptyCount = 0, bCount = 0, fCount = 0;
        int totalCells = solvedBoard.length * solvedBoard[0].length;
    
        for (int i = 0; i < solvedBoard.length; i++) {
            for (int j = 0; j < solvedBoard[i].length; j++) {
                switch (solvedBoard[i][j]) {
                    case 'F': fCount++; break;
                    case 'B': bCount++; break;
                    case '~': emptyCount++; break;
                }
            }
        }
    
        double flowerExpected = 45 / 100.0 * totalCells;
        double bombExpected = 25 / 100.0 * totalCells;
        double emptyExpected = 30 / 100.0 * totalCells;
    
        double tolerance = 0.1 * totalCells; // Allowable deviation (10%)
        if (Math.abs(fCount - flowerExpected) > tolerance ||
            Math.abs(bCount - bombExpected) > tolerance ||
            Math.abs(emptyCount - emptyExpected) > tolerance) {
            validContents = false;
        }
    
        return validContents;
    }
    public static void optionMenu(){
        System.out.println("Bienvue aux Jeu des mines fleuries!");
        System.out.println("Select your difficulty level:");
        System.out.println("1. Facile");
        System.out.println("2. Medium");
        System.out.println("3. Dificile");
    }
    public static void fillezboard(){
        int hardTabLonge = 5;
        int hardTabHaut = 5;
        char board[][] = new char[hardTabLonge][hardTabHaut];
        remplirTableauDouble(board);
        afficherTableauDouble(board);

    }
    public static void fillmidboard(){
        int hardTabLonge = 10;
        int hardTabHaut = 10;
        char board[][] = new char[hardTabLonge][hardTabHaut];
        remplirTableauDouble(board);
        afficherTableauDouble(board);
    }
    public static void fillboard(Scanner scanner){
        System.out.println("Quelle hauteur que vous voulez? (min 10)");
        int hardTabLonge = scanner.nextInt();
        System.out.println("Quelle longeur que vous voulez? (min 10)");
        int hardTabHaut = scanner.nextInt();
        char board[][] = new char[hardTabLonge][hardTabHaut];
        remplirTableauDouble(board);
        afficherTableauDouble(board);
        afficherTableauDouble(board);
        
    }
    
}