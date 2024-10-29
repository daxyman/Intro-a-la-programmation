package tp1.zoo;
import java.util.Scanner; //bruh make 3 tables, one for weigh, one for species and one for name
public class tp1_zoo {

private static String[][] animauxdata = new String[2][3]; // 2D table to store animal data
private static int animalCount = 0;

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in); //what are objects dude it seems like the best solution here
boolean runCode = true;

    while (runCode) {
        showMenu();
        String input1 = scanner.nextLine();
        int option = Integer.parseInt(input1);

        switch (option) {
        case 1:
            ajouterNouveauAnimal(scanner); //si bien , utiliser une page differente pour chaque un est moins efficient, il m'aide a m'organiser
            break;
        case 2:
            afficherListeAnimaux();
            break;
        case 3:
            rechercherAnimal(scanner);
            break;
        case 4:
            methodes.modifierPoidsAnimal();
            break;
        case 5:
            methodes.ajouterVisiteursParAnimal();
            break;
        case 6:
            methodes.calculerTotalVisiteursZoo();
            break;
        case 7:
            methodes.calculerPoidsMoyenAnimauxZoo();
            break;
        case 8:
            methodes.trouverAnimauxExtremes();
            break;
        case 9:
            methodes.afficherResumeCompletZoo();
            break;
        case 0:
            runCode = quitterProgramme(scanner);
            break;
        default:
            System.out.println("Pas une option, desole!");
            break;
        }
    }
}
public static void showMenu(){ //dude why using a capital M in showMenu stops it from buging?? // mf it's oct 22th, like a week after i typed this and still got NO idea// oct 25, it's because it's a method, it can't have the same name as a syntax bc java is case sensitive // oct29th i forgot what this meant lol
    System.out.println("");
    System.out.println("<-------------------------------------------------------->");
    System.out.println("Bienvenue au zoo!");
    System.out.println("Que desirez vous faire?");
    System.out.println("<-------------------------------------------------------->");
    System.out.println("");
    System.out.println("1. Ajouter un nouvel animal");
    System.out.println("2. Afficher la liste des animaux et leurs informations");
    System.out.println("3. Vérifier si un animal est dans le zoo");
    System.out.println("4. Modifier le poids d'un animal");
    System.out.println("5. Ajouter des visiteurs pour une journée");
    System.out.println("6. Afficher le nombre total de visiteurs");
    System.out.println("7. Afficher le poids moyen des animaux");
    System.out.println("8. Trouver l'animal le plus lourd et le plus léger");
    System.out.println("9. Afficher un résumé complet du zoo (visiteurs et animaux)");
    System.out.println("0. Quitter le programme");
    System.out.println("");
    System.out.println("");
    System.out.println("<-------------------------------------------------------->");
}    

public static void ajouterNouveauAnimal(Scanner scanner /*get scanner from main */) { 
    System.out.println("Option 1, ajouter un nouvel animal:");
    while (true) {
        if (animalCount == animauxdata.length) {
            animauxdata = redimensionnerTableau(animauxdata); // resize table if full
        }

        System.out.println("C'est quoi le nom de votre nouvel animal? (ou -1 pour arrêter)");
        animauxdata[animalCount][0] = scanner.nextLine(); //nom
        
        if (animauxdata[animalCount][0].equals("-1")) {
            break; // exit loop if user enters -1
        }

        System.out.println("C'est quoi l'espèce de votre nouvel animal?");
        animauxdata[animalCount][1] = scanner.nextLine(); //espece

        System.out.println("C'est quoi le poids en kg de votre nouvel animal?");
        animauxdata[animalCount][2] = scanner.nextLine(); //poids

        animalCount++; // go down one, next animal

        System.out.println("Animal ajouté avec succès!\n");
    }
}

public static void afficherListeAnimaux() {
    System.out.println("animaux en total: " + animalCount); // shows total animals added

    for (int i = 0; i < animalCount; i++) {
        System.out.println("Animal " + (i + 1) + ":"); // label for each animal entry
        System.out.println("  Name: " + animauxdata[i][0]);     // Nom
        System.out.println("  especie: " + animauxdata[i][1]);  // species
        System.out.println("  poids: " + animauxdata[i][2]);   // Weight
        System.out.println();
    }
}
public static void rechercherAnimal(Scanner scanner){
    System.out.println("choisisez un des donnes des animaux pour faire une recherche");
    System.out.println("1. Nom");
    System.out.println("2. espece");
    System.out.println("3. poids");
    
    String input2 = scanner.nextLine();
        int option1 = Integer.parseInt(input2);
    switch (option1) {
        case 1:
        System.out.println("entrez le nom de l'animal");
        String input3 = scanner.nextLine();
        System.out.println("animals that are named "+ input3 + "are: ");
        for(int i : 0){

        }
        
            break;
        case 2:
        System.out.println("entrez l'espece de l'animal");
        String input4 = scanner.nextLine();
        System.out.println("notre reserve de " + input4 + " est :");
            
            break;
        case 3:
        System.out.println("entrez le poids de l'animal");
        String input5 = scanner.nextLine();
        System.out.println("animals that weight "+ input5 + "are: ");
            
            break;
        default:
        System.out.println("pas une option, Bye!");
            break;
    }
}
    
    

public static boolean quitterProgramme(Scanner scanner) {
    System.out.println("Vous etez sûr(e) de sortir du programme?");
    System.out.println("1. Oui");
    System.out.println("2. Non");
    String input6 = scanner.nextLine();
    int exitprogram = Integer.parseInt(input6);
    boolean choice = true;
    
    switch (exitprogram){
    case 1:
        System.out.println("Exit");
        choice = false; // returns false to stop the main loop
    case 2:
        System.out.println("you silly goose!");
        choice = true;
    }
    return choice;
}

public static String[][] redimensionnerTableau(String[][] oldTable) {
    String[][] newTable = new String[oldTable.length * 2][3];
    for (int i = 0; i < oldTable.length; i++) {
        newTable[i] = oldTable[i];
    }
    return newTable;
}
}
