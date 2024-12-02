package tps.tp2;
import java.util.InputMismatchException; //j'ai vu en ligne ce util, il detecte lorse que le contenu d'une variable n'est pas du type attendu, trés util pour mes try-catch
import java.util.Scanner;
import java.lang.Math;

public class tp2 {
public static char valeursPossiblesTableau[] = {'B', '✿', '~'}; //valeurs qui la table peux prendre
public static int tailleTableau = 0;

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);//declarer un scanner
int difficulte = obtenirDifficulte(scanner);//obtenir la difficulté desirée
char[][] tableau = genererTableau(difficulte, scanner);//generer un tableau en utilisant la difficulté desirée
jouerPartie(tableau, scanner);//jouer le jeu avec la difficultée et le tableau deja remis
scanner.close();//fermer scanner
}
public static int obtenirDifficulte(Scanner scanner) { //ici je demande la difficulté a l'utilisateur
System.out.println("Bienvenue au Jeu des Mines Fleuries !");
System.out.println("Choisissez un niveau de difficulté :");
System.out.println("1. Facile (5x5)");
System.out.println("2. Moyen (10x10)");
System.out.println("3. Difficile (taille personnalisée)");

int difficulté = -1; //juste pour etre sur que s'il y a quelque chose incorrecte je ne passera a la difficulté 1 automatiquement
while (true) {
    try {
        System.out.print("Votre choix (1, 2 ou 3) : ");
        difficulté = scanner.nextInt();

        if (difficulté >= 1 && difficulté <= 3) { // demander la difficulté, s'il est un des valeurs autorisés, on retourne le valeur en question
            return difficulté;
        } else {
            System.out.println("Erreur : Veuillez entrer un nombre entre 1 et 3.");
        }
    } catch (InputMismatchException e) { //en cas que l'input d'utilisateur n'est pas un int valide
        System.out.println("Erreur : Veuillez entrer un nombre entre 1 et 3.");
        scanner.nextLine(); //jsp pq le try-catch brise le code completement au moins que j'ecris ça
    }
}
}
public static char[][] genererTableau(int difficulte, Scanner scanner) { //methode pour generer le tableau qu'on voit en tout temps, en base du difficulté du methode obtenirDifficulté()
int hauteurTableau = 0;
int longueurTableau = 0;

if (difficulte == 1) { 
    hauteurTableau = 5;
    longueurTableau = 5;
} else if (difficulte == 2) {
    hauteurTableau = 10;
    longueurTableau = 10;
} //les deux premieres difficultés sont vraiment faciles a gerer, il faut juste changer la quantité. 
else if (difficulte == 3) {
while (true) { // demande a nouveau jusqu'a les deux sont valides
try {
    System.out.println("Entrez la hauteur du tableau (entier >= 10) :");
    hauteurTableau = scanner.nextInt();
    if (hauteurTableau < 10) {
        throw new IllegalArgumentException("La hauteur doit être supérieure ou égale à 10."); //si la hauteur n'est pas correcte
    }

    System.out.println("Entrez la largeur du tableau (entier >= 10) :");
    longueurTableau = scanner.nextInt();

    if (longueurTableau < 10) {
        throw new IllegalArgumentException("La largeur doit être supérieure ou égale à 10."); //si la longueur n'est pas correcte
    }

    break; // Sortir loop si les deux sont corrects
}
//si un des donnes n'est pas un valeur int valide 
catch (InputMismatchException e) { 
    System.out.println("Erreur : Les entrées doivent être des entiers valides.");
    scanner.nextLine();
} catch (IllegalArgumentException e) {
    System.out.println("Erreur : " + e.getMessage());
}
}
}

// le tableau est cree et rempli
char[][] tableau = new char[hauteurTableau][longueurTableau];
remplirTableau(tableau);
return tableau;
}
public static char[][] remplirTableau(char[][] tableau) { //ici je remplis le tableu qu'on voit avec des X, pas beaucoup a dire, un boucle loop trés simple
for (int i = 0; i < tableau.length; i++) {
    for (int j = 0; j < tableau[i].length; j++) {
        tableau[i][j] = 'X';
    }
}
return tableau;
}
public static char[][] tableauResolue(char[][] tableau) { //je fais une deuxieme table de meme grandeur que l'un qu'on voit mais avec des fleurs, cases vides et des bombes, comme ca je peux simplement changer les valeur d'unne avec l'autre
char[][] tableauResolue = new char[tableau.length][tableau[0].length];
/*j'avais fait un remplissage differente pour es 3 difficultés, mais j'avais realisé que si jamais la personne veux changer la quantité de cases
dans les difficultés facile et moyenne, le code brise, la methode choixAleatoire n'est pas parfaite mais DAMN elle est la meilleure solution
que j'ai trouvé, elle peut s'ajuster a beaucoup de changements futurs (ça c'est du bon code selon ma prof de programmation)*/
for (int i = 0; i < tableau.length; i++) {
    for (int j = 0; j < tableau[0].length; j++) {
        char choice = choixAleatoire();
        tableauResolue[i][j] = choice;
    }
}
return tableauResolue;
}
public static char choixAleatoire() { //En faissant random.math, ce methode pour remplir la table resolue s'approche de 25% Bombes(B), 45% fleurs(F) and 30% de cases vides(~).
//generer un numero alearoire entre 1 et 100
int nombreAleatoire = (int)(Math.random() * 100) + 1;
/*Je trouve que c'est la meilleure méthode, d'autres faissent un boucle indéfiniment si le nombre ne pouvait pas être divisé selon les pourcentages.
La solution à cela était généralement une marge d'erreur qui elongait le code innecessairement. Cette solution ne fournit pas les pourcentages requis à 100 % du temps, 
mais elle s'en rapproche beaucoup la plupart du temps a cause de simple stadistique.*/
if (nombreAleatoire <= 45) {
    return '✿'; // 45% chance
} else if (nombreAleatoire <= 70) {
    return 'B'; // 25% chance
} else {
    return '~'; // 30% chance
}
}
public static void afficherTableau(char[][] tableau) { //methode pour afficher un tableau, util pour tester tableauResolue
for (int i = 0; i < tableau.length; i++) {
    for (int j = 0; j < tableau[i].length; j++) {
        System.out.print(tableau[i][j] + " ");
        tailleTableau += 1;
    }
    System.out.println();
}
}
public static void jouerPartie(char[][] tableau, Scanner scanner) { //methode ou le jeu se passe, il faut juste remplacer les valeurs d'unne table avec l'autre selon les coordonees
afficherTableau(tableau);
char[][] tableResolue = tableauResolue(tableau);
System.out.println("=== Début du jeu ===");
int fleursRecoltees = 0;
int coupsJoues = 0;
while (true) { //repeter pour continuer le jeu
    System.out.println("Entrez les coordonnées (ligne cologne) (x y) :");
try { //try-catch pour s'assurer que l'utilisateur rentre seulement des valeurs qui soient Ints et plus petits que la longueur du table 
    System.err.println("ligne (x):");
    int ligne = scanner.nextInt() -1;
    System.err.println("cologne (y):");
    int colonne = scanner.nextInt() -1;

    if (!validerCoordonnees(tableau, ligne, colonne)) { //j'utilise une contition booleane ici pour m'assurer que tout est bon
        System.out.println("Coordonnées invalides. Réessayez.");
        continue;
    }

    if (tableau[ligne][colonne] != 'X') { //en cas que la personne veux decouvrir une case deja decouverte (lmao)
        System.out.println("Case déjà découverte. Réessayez.");
        continue;
    }

    coupsJoues++; //compteur pour chaque fois que la personne a joué, il devrair incrementer seulement si une nouvelle case est decouverte
    char caseRevelee = tableResolue[ligne][colonne];

    //ici bas c'est quoi faire en case de trouver chaque chose
    //ici j'ai une question pour vous madame, deja que tout le monde vous demande pq le jeu est impossible de gagner, pq vous n'avez pas demande un systeme de vies?, dissons 3 vies par tour, il y aurait l'air plus "possible"
    if (caseRevelee == 'B') { 
        System.out.println("Oh non 😞! Vous avez trouvé une mine. Fin de la partie.");
        break;
    } else if (caseRevelee == '✿') {
        System.out.println("Youpi !!! Vous avez trouvé une fleur !");
        fleursRecoltees++;
        tableau[ligne][colonne] = '✿';
        if (fleursRecoltees == compterFleurs(tableResolue)) {
            System.out.println("Félicitations ! Vous avez récolté toutes les fleurs !");
            break;
        }
    } else {
        System.out.println("Fiouuu... Case vide.");
        tableau[ligne][colonne] = '~';
    }
    afficherTableau(tableau); // afficher tableau avec la nouvelle case decouverte
} catch (InputMismatchException e) { // en cas que l'utilisateur veut rentrer un valeur non int ou plus grand ou petit que possible
    System.out.println("Erreur : Entrée invalide. Veuillez entrer des entiers.");
    scanner.nextLine();
}
}
    afficherResultats(tableau, tableResolue, coupsJoues, fleursRecoltees); //dates requises pour le resume du jeu
}
//ici le jeu doit se repeter, au moins que l'utilisateur a trouvé une mine
public static boolean validerCoordonnees(char[][] tableau, int ligne, int colonne) { //un boolean qui confirme si les conditions sont acomplies
    return ligne >= 0 && ligne < tableau.length && colonne >= 0 && colonne < tableau[0].length;
}
public static int compterFleurs(char[][] tableau) { //compter les fleurs trouvées
int count = 0;
for (int i = 0; i < tableau.length; i++) {
    for (int j = 0; j < tableau[i].length; j++) {
        if (tableau[i][j] == '✿') {
            count++;
        }
    }
}
return count;
}
public static void afficherResultats(char[][] tableau, char[][] tableResolue, int coupsJoues, int fleursRecoltees) { //j'ai amelioré la façon de nommer mes methodes lol, mon tp1 etait un peu dificile de lire a la fin
System.out.println("\n=== Fin de la Partie ===");
System.out.println("Nombre de coups joués : " + coupsJoues);
System.out.println("Nombre de fleurs récoltées : " + fleursRecoltees);
System.out.println("\nCarte complète :");

for (int i = 0; i < tableResolue.length; i++) {
    for (int j = 0; j < tableResolue[i].length; j++) {
        System.out.print(tableResolue[i][j] + " ");
    }
    System.out.println();
}
}
}