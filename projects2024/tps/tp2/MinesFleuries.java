package tps.tp2;

import java.util.Random;
import java.util.Scanner;

public class MinesFleuries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenue au jeu des Mines Fleuries !");
        
        // Choix de la difficulté
        System.out.println("Choisissez un niveau de difficulté :");
        System.out.println("1 - Facile (25 cases)");
        System.out.println("2 - Moyen (100 cases)");
        System.out.println("3 - Difficile (taille personnalisée)");
        int niveau = scanner.nextInt();
        
        int rows, cols;
        switch (niveau) {
            case 1 -> { rows = 5; cols = 5; }
            case 2 -> { rows = 10; cols = 10; }
            case 3 -> {
                System.out.println("Entrez le nombre de lignes :");
                rows = scanner.nextInt();
                System.out.println("Entrez le nombre de colonnes :");
                cols = scanner.nextInt();
                if (rows * cols < 100) {
                    System.out.println("La taille minimale est de 100 cases. Réessayez.");
                    return;
                }
            }
            default -> {
                System.out.println("Choix invalide. Réessayez.");
                return;
            }
        }

        char[][] terrain = new char[rows][cols];
        initialiserTerrain(terrain);
        
        int totalCases = rows * cols;
        int mines = (int) (totalCases * 0.25);
        int fleurs = (int) (totalCases * 0.45);
        placerElements(terrain, mines, fleurs);
        
        int fleursRestantes = fleurs;
        int coupsJoues = 0;
        boolean partieTerminee = false;

        while (!partieTerminee && fleursRestantes > 0) {
            afficherTerrain(terrain, false);
            System.out.println("Entrez les coordonnées (ligne colonne) :");
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;

            if (x < 0 || x >= rows || y < 0 || y >= cols) {
                System.out.println("Coordonnées invalides. Réessayez.");
                continue;
            }

            switch (terrain[x][y]) {
                case '✿' -> {
                    System.out.println("Youpi !!! Vous avez trouvé une fleur !");
                    terrain[x][y] = '~'; // Fleur récoltée
                    fleursRestantes--;
                }
                case 'M' -> {
                    System.out.println("Oh non 😞 Vous avez trouvé une mine !");
                    partieTerminee = true;
                }
                case 'X' -> System.out.println("Fiouuu... Case vide.");
                default -> System.out.println("Case déjà découverte !");
            }
            coupsJoues++;
        }

        if (partieTerminee) {
            System.out.println("Partie terminée. Vous avez perdu !");
        } else {
            System.out.println("Félicitations ! Vous avez récolté toutes les fleurs !");
        }

        System.out.println("Statistiques :");
        System.out.println("Nombre de coups joués : " + coupsJoues);
        System.out.println("Nombre de fleurs récoltées : " + (fleurs - fleursRestantes));
        afficherTerrain(terrain, true);
    }

    public static void initialiserTerrain(char[][] terrain) {
        for (int i = 0; i < terrain.length; i++) {
            for (int j = 0; j < terrain[i].length; j++) {
                terrain[i][j] = 'X'; // Toutes les cases sont initialement non découvertes
            }
        }
    }

    public static void placerElements(char[][] terrain, int mines, int fleurs) {
        Random random = new Random();
        placerElement(terrain, mines, 'M'); // Placer les mines
        placerElement(terrain, fleurs, '✿'); // Placer les fleurs
    }

    public static void placerElement(char[][] terrain, int count, char element) {
        Random random = new Random();
        int placed = 0;
        while (placed < count) {
            int x = random.nextInt(terrain.length);
            int y = random.nextInt(terrain[0].length);
            if (terrain[x][y] == 'X') { // Place uniquement sur une case non découverte
                terrain[x][y] = element;
                placed++;
            }
        }
    }

    public static void afficherTerrain(char[][] terrain, boolean reveler) {
        for (int i = 0; i < terrain.length; i++) {
            for (int j = 0; j < terrain[i].length; j++) {
                if (!reveler && (terrain[i][j] == 'M' || terrain[i][j] == '✿')) {
                    System.out.print("X "); // Ne pas révéler mines et fleurs pendant la partie
                } else {
                    System.out.print(terrain[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}