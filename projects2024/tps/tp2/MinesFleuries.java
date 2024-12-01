package tps.tp2;

import java.util.Random;
import java.util.Scanner;

public class MinesFleuries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int difficulty = getDifficulty(scanner);
        char[][] board = generateBoard(difficulty, scanner);
        playGame(board, scanner);
        scanner.close();
    }

    public static int getDifficulty(Scanner scanner) {
        System.out.println("Bienvenue au Jeu des Mines Fleuries !");
        System.out.println("Choisissez un niveau de difficulté :");
        System.out.println("1. Facile (5x5)");
        System.out.println("2. Moyen (10x10)");
        System.out.println("3. Difficile (taille personnalisée)");
        int difficulty = scanner.nextInt();
        return (difficulty >= 1 && difficulty <= 3) ? difficulty : getDifficulty(scanner);
    }

    public static char[][] generateBoard(int difficulty, Scanner scanner) {
        int size = 0;
        if (difficulty == 1) size = 5;
        if (difficulty == 2) size = 10;
        if (difficulty == 3) {
            System.out.println("Entrez la taille du tableau (≥ 10) :");
            size = scanner.nextInt();
            size = Math.max(size, 10); // Taille minimale de 10
        }

        int totalCells = size * size;
        int mines = (int) (totalCells * 0.25); // 25% mines
        int flowers = (int) (totalCells * 0.45); // 45% flowers

        char[][] board = new char[size][size];
        fillBoard(board, mines, flowers);
        return board;
    }

    public static void fillBoard(char[][] board, int mines, int flowers) {
        int size = board.length;
        Random random = new Random();

        // Initialize the board with empty spaces
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = '~'; // Empty by default
            }
        }

        // Place mines randomly
        int placedMines = 0;
        while (placedMines < mines) {
            int x = random.nextInt(size);
            int y = random.nextInt(size);
            if (board[x][y] == '~') {
                board[x][y] = 'B'; // Mine
                placedMines++;
            }
        }

        // Place flowers randomly
        int placedFlowers = 0;
        while (placedFlowers < flowers) {
            int x = random.nextInt(size);
            int y = random.nextInt(size);
            if (board[x][y] == '~') {
                board[x][y] = 'F'; // Flower
                placedFlowers++;
            }
        }
    }

    public static void playGame(char[][] board, Scanner scanner) {
        int size = board.length;
        boolean[][] discovered = new boolean[size][size];
        int moves = 0, flowersCollected = 0;
        boolean gameOver = false;

        while (!gameOver) {
            displayBoard(board, discovered, false);
            int[] coords = getValidCoordinates(scanner, size);
            int x = coords[0];
            int y = coords[1];

            if (discovered[x][y]) {
                System.out.println("Case déjà découverte !");
                continue;
            }

            discovered[x][y] = true;
            char cell = board[x][y];
            moves++;

            if (cell == 'B') {
                System.out.println("Oh non 😞 Vous êtes tombé sur une mine !");
                gameOver = true;
            } else if (cell == 'F') {
                System.out.println("Youpi !!! Vous avez trouvé une fleur !");
                flowersCollected++;
            } else {
                System.out.println("Fiouuu... Rien ici.");
            }

            // Check if player has collected all flowers
            if (flowersCollected == countFlowers(board)) {
                System.out.println("Félicitations ! Vous avez récolté toutes les fleurs !");
                gameOver = true;
            }
        }

        displayBoard(board, discovered, true);
        displayStatistics(moves, flowersCollected);
    }

    public static int[] getValidCoordinates(Scanner scanner, int size) {
        System.out.println("Entrez les coordonnées (x y) :");
        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (x >= 0 && x < size && y >= 0 && y < size) {
                return new int[]{x, y};
            }
        } catch (Exception e) {
            scanner.nextLine(); // Clear input buffer
        }
        System.out.println("Entrée invalide. Essayez encore.");
        return getValidCoordinates(scanner, size);
    }

    public static void displayBoard(char[][] board, boolean[][] discovered, boolean reveal) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (reveal || discovered[i][j]) {
                    if (board[i][j] == 'F') System.out.print("✿ ");
                    else if (board[i][j] == '~') System.out.print("~ ");
                    else System.out.print("B ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    public static int countFlowers(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'F') count++;
            }
        }
        return count;
    }

    public static void displayStatistics(int moves, int flowersCollected) {
        System.out.println("Statistiques de la partie :");
        System.out.println("Nombre de coups joués : " + moves);
        System.out.println("Nombre de fleurs récoltées : " + flowersCollected);
    }
}