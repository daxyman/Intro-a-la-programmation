package tp1.zoo;
import java.util.Scanner;

public class tp1_zoo {

    private static String[][] animauxdata = new String[2][3]; // 2D table to store animal data
    private static int animalCount = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //what are objects dude it seems like the best solution here
        boolean runCode = true;

        while (runCode) {
            showmenu.showMenu();
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
                    rechercherAnimal();
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
                    runCode = quitterProgramme();
                    break;
                default:
                    System.out.println("Pas une option, desole!");
                    break;
            }
        }
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
            String poidsAnimal = scanner.nextLine();

            // store animal details in table
            animauxdata[animalCount][0] = nomAnimal;
            animauxdata[animalCount][1] = especeAnimal;
            animauxdata[animalCount][2] = poidsAnimal;
            animalCount++;

            System.out.println("Animal ajouté avec succès!\n");
        }
    }

    public static void afficherListeAnimaux() {
        System.out.println("Total animals added: " + animalCount); // shows total animals added
    
        for (int i = 0; i < animalCount; i++) {
            System.out.println("Animal " + (i + 1) + ":"); // label for each animal entry
            System.out.println("  Name: " + animauxdata[i][0]);     // Nom
            System.out.println("  especie: " + animauxdata[i][1]);  // species
            System.out.println("  poids: " + animauxdata[i][2]);   // Weight
            System.out.println();
        }
    }
    public static void rechercherAnimal(){
        Scanner scanner = new Scanner (System.in);
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
            
                break;
            case 2:
            System.out.println("entrez l'espece de l'animal");
                
                break;
            case 3:
            System.out.println("entrez le poids de l'animal");
                
                break;
            default:
            System.out.println("pas une option, Bye!");
                break;
        }
    }
    
    

    public static boolean quitterProgramme() {
        System.out.println("Exiting...");
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
