package tp1.zoo;
import java.util.Scanner; //bruh make 3 tables, one for weigh, one for species and one for name
public class tp1_zoo {

private static String[][] animauxdata = new String[2][3]; // 2D table to store animal data
private static int animalCount = 0;
private static int[] visiteurs = new int[animauxdata.length];

public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // what are objects dude it seems like the best solution here
        boolean runCode = true;

    while (runCode) {
        showMenu();
        System.out.println();
        System.out.println("ce quoi votre choix?");
        String input1 = scanner.nextLine();
        int option = Integer.parseInt(input1);

            switch (option) {
                case 1:
                    ajouterNouveauAnimal(scanner); // si bien , utiliser une page differente pour chaque un est moins efficient, il m'aide a m'organiser
                    break;
                case 2:
                    afficherListeAnimaux();
                    break;
                case 3:
                    rechercherAnimal(scanner);
                    break;
                case 4:
                    modifierPoidsAnimal(scanner);
                    break;
                case 5:
                    ajouterVisiteursParAnimal(scanner);
                    break;
                case 6:
                    calculerTotalVisiteursZoo();
                    break;
                case 7:
                    calculerPoidsMoyenAnimaux();
                    break;
                case 8:
                    trouverAnimauxExtremes();
                    break;
                case 9:
                    afficherResumeCompletZoo();
                    break;
                case 0:
                    runCode = quitterProgramme();
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

    public static void ajouterNouveauAnimal(Scanner scanner) { // get scanner from main
        System.out.println("Option 1, ajouter un nouvel animal:");
        while (true) {
            if (animalCount == animauxdata.length) {
                animauxdata = redimensionnerTableau(animauxdata); // resize table if full
            }

            System.out.println("C'est quoi le nom de votre nouvel animal? (ou -1 pour arrêter)");
            String nomAnimal = scanner.nextLine();
            if (nomAnimal.equals("-1")) {
                break; // exit loop if user enters -1
            }

            System.out.println("C'est quoi l'espèce de votre nouvel animal?");
            String especeAnimal = scanner.nextLine();

            System.out.println("C'est quoi le poids de votre nouvel animal?");
            double poidsAnimal = Double.parseDouble(scanner.nextLine()); // parses poids as double

            // store animal details in table
            animauxdata[animalCount][0] = nomAnimal;
            animauxdata[animalCount][1] = especeAnimal;
            animauxdata[animalCount][2] = String.valueOf(poidsAnimal); // convert to string for storage
            animalCount++;

            System.out.println("Animal ajouté avec succès!");
        }
    }

    public static void rechercherAnimal(Scanner scanner) {
    System.out.println("Choisissez un des critères pour faire une recherche:");
    System.out.println("1. Nom");
    System.out.println("2. Espèce");
    System.out.println("3. Poids");
    String input2 = scanner.nextLine();
    int option1 = Integer.parseInt(input2);
    boolean found = false;

    switch (option1) {
        case 1:
            System.out.println("Entrez le nom de l'animal:");
            String nomRecherche = scanner.nextLine();
            System.out.println("Animaux avec le nom " + nomRecherche + ":");
            for (int i = 0; i < animalCount; i++) {
                if (animauxdata[i][0].equalsIgnoreCase(nomRecherche)) {
                    afficherSingleAnimal(i);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Aucun animal trouvé avec ce nom.");
            }
            break;
        case 2:
            System.out.println("Entrez l'espèce de l'animal:");
            String especeRecherche = scanner.nextLine();
            System.out.println("Animaux de l'espèce " + especeRecherche + ":");
            for (int i = 0; i < animalCount; i++) {
                if (animauxdata[i][1].equalsIgnoreCase(especeRecherche)) {
                    afficherSingleAnimal(i);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Aucun animal trouvé de cette espèce.");
            }
            break;
        case 3:
            System.out.println("Entrez le poids de l'animal:");
            double poidsRecherche = Double.parseDouble(scanner.nextLine());
            System.out.println("Animaux avec le poids " + poidsRecherche + ":");
            for (int i = 0; i < animalCount; i++) {
                if (Double.parseDouble(animauxdata[i][2]) == poidsRecherche) {
                    afficherSingleAnimal(i);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Aucun animal trouvé avec ce poids.");
            }
            break;
        default:
            System.out.println("Pas une option, Bye!");
            break;
    }
}
public static void afficherListeAnimaux() { //shows ALL animals in animauxdata
    System.out.println("Total animals added: " + animalCount); // shows total animals added

    for (int i = 0; i < animalCount; i++) {
        System.out.println("Animal " + (i + 1) + ":"); // label each animal
        System.out.println("  Name: " + animauxdata[i][0]);     // Nom
        System.out.println("  especie: " + animauxdata[i][1]);  // species
        System.out.println("  poids: " + animauxdata[i][2]);   // Weight
        System.out.println();
    }
}
private static void afficherSingleAnimal(int index) {//shows details for A SINGLE animal  //this one is exclusively for rechercherAnimal, i dont know why afficherListeAnimaux is not working, i just made a new one it'd be easier this
    System.out.println("Animal " + (index + 1) + ":");
    System.out.println("  Nom: " + animauxdata[index][0]);
    System.out.println("  Espèce: " + animauxdata[index][1]);
    System.out.println("  Poids: " + animauxdata[index][2]);
    System.out.println();
}

public static void modifierPoidsAnimal(Scanner scanner) {
    System.out.println("Enter the name of the animal u wanna edit the weight of:");
    String nomAnimal = scanner.nextLine();
    boolean found = false;
    for (int i = 0; i < animalCount; i++) {
        if (animauxdata[i][0].equalsIgnoreCase(nomAnimal)) { // compare name
            System.out.println("Enter the new weight for " + nomAnimal + ":");
            double newPoids = Double.parseDouble(scanner.nextLine());
            animauxdata[i][2] = String.valueOf(newPoids); // update weight as string
            System.out.println("Weight updated successfully for " + nomAnimal);
            found = true;
            break;
        }
    }
    if (!found) {
        System.out.println("No animal found with that name.");
    }
}
public static void ajouterVisiteursParAnimal(Scanner scanner) {
    System.out.println("Enter the name of the animal to add visitors:");
    String nomAnimal = scanner.nextLine();
    boolean visit = false; //j'ai 0 idee comment faire pour ne pas valider visiteurs negatifs, mais il est deja trop tard honnetment
    for (int i = 0; i < animalCount; i++) {
        if (animauxdata[i][0].equalsIgnoreCase(nomAnimal)) { // search for animal by name
            System.out.println("How many visitors to add for " + nomAnimal + "?");
            int newVisitors = Integer.parseInt(scanner.nextLine());
            visiteurs[i] += newVisitors; // actualise total visiteurs for that animal
            System.out.println("Updated visitor count for " + nomAnimal + ": " + visiteurs[i]);
            visit = true;
            break;
        }
    }
    if (!visit) {
        System.out.println("No animal found with that name.");
    }
}
public static void calculerTotalVisiteursZoo() {
    int totalVisitors = 0; // si j'etablise un total et je le change apres il sera plus facile que l'inverse tbh
    for (int i =0; i < animalCount;i++) {
        totalVisitors += visiteurs[i]; // add each animal’s visitors to the total
    }
    System.out.println("Total visitors for all animals in the zoo: " + totalVisitors);
}
//NOT GONNA LIE apres certain point c'est just la meme affaire, fait une table, for loop pour le naviger, n'importe quel variable, change la variable a ce que je cherche
public static void calculerPoidsMoyenAnimaux() {
    if (animalCount == 0) {
        System.out.println("No animals in the zoo to calculate an average weight.");
        return;
    }
    double totalWeight = 0.0;
    for (int i =0; i < animalCount;i++) {
        totalWeight += Double.parseDouble(animauxdata[i][2]); // parse and add each weight
    }
    double averageWeight =totalWeight/ animalCount; // calculate average weight
    System.out.println("Average weight of animals in the zoo: " + averageWeight + " kg");
}
public static void trouverAnimauxExtremes() {
    if (animalCount == 0) {
        System.out.println("No animals in the zoo to compare weights.");
        return;
    }
    
    double maxWeight = Double.MIN_VALUE;
    double minWeight = Double.MAX_VALUE;
    int heaviestIndex = -1;
    int lightestIndex = -1;

    for (int i = 0; i < animalCount; i++) {
        double poids = Double.parseDouble(animauxdata[i][2]); // get weigh
        if (poids > maxWeight) {
            maxWeight = poids;
            heaviestIndex = i;
        }
        if (poids < minWeight) {
            minWeight = poids;
            lightestIndex = i;
        }
    }
    // LOURD animal
    System.out.println("animal plus lourd:");
    System.out.println("  Name: " + animauxdata[heaviestIndex][0]);
    System.out.println("  Species: " + animauxdata[heaviestIndex][1]);
    System.out.println("  Weight: " + animauxdata[heaviestIndex][2] + " kg");
    System.out.println();

    // light animal
    System.out.println("animal plus lourd:");
    System.out.println("  Name: " + animauxdata[lightestIndex][0]);
    System.out.println("  Species: " + animauxdata[lightestIndex][1]);
    System.out.println("  Weight: " + animauxdata[lightestIndex][2] + " kg");
}

public static void afficherResumeCompletZoo() {
    System.out.println("<---------------- Zoo Summary ---------------->");

    System.out.println("Total Visitors:");
    calculerTotalVisiteursZoo();

    System.out.println("Animal List:");
    afficherListeAnimaux(); 
    
    System.out.println("Average Weight of Animals:");
    calculerPoidsMoyenAnimaux();

    System.out.println("Heaviest and Lightest Animals:");
    trouverAnimauxExtremes();

    System.out.println("<---------------- End of Summary ---------------->");
}

public static boolean quitterProgramme() {
    System.out.println("bye-bye!");
    return false; // returns false to stop the main loop
}
public static String[][] redimensionnerTableau(String[][] oldTable) {
    String[][] newTable = new String[oldTable.length * 2][3];
    for (int i = 0; i < oldTable.length; i++) {
        newTable[i] = oldTable[i];
    }
    return newTable;
}
}
