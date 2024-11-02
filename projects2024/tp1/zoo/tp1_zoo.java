package tp1.zoo;
import java.util.Scanner; //bruh make 3 tables, one for weigh, one for species and one for name
public class tp1_zoo {

private static String[][] animauxdata = new String[20][3]; // 2D table to store animal data
private static int animalCount = 0;
private static int[] visiteurs = new int[animauxdata.length];
public static void main(String[] args) {
            animauxdata[0][0] = "d";
            animauxdata[0][1] = "c";
            animauxdata[0][2] = "1";
            animalCount = 1;

        Scanner scanner = new Scanner(System.in); // what are objects dude it seems like the best solution here
        boolean runCode = true;
        int option;
        while (runCode) {
            showMenu();
            System.out.println();
            System.out.println("C'est quoi votre choix?");
            String input1 = scanner.nextLine();
            if (input1.isEmpty()) { // Check if input is empty
                System.out.println("Entrée non valide. Veuillez entrer un numéro.");
                continue;
            }
            try { 
            option = Integer.parseInt(input1); // Try to parse input as an integer
            } catch (NumberFormatException e) {
                System.out.println("Entrée non valide. Veuillez entrer un numéro.");
                continue;
            }
            switch (option) {
                case 1: ajouterNouveauAnimal(scanner); break;
                case 2: afficherListeAnimaux(); break;
                case 3: rechercherAnimal(scanner); break;
                case 4: modifierPoidsAnimal(scanner); break;
                case 5: ajouterVisiteursParAnimal(scanner); break;
                case 6: calculerTotalVisiteursZoo(); break;
                case 7: calculerPoidsMoyenAnimaux(); break;
                case 8: trouverAnimauxExtremes(); break;
                case 9: afficherResumeCompletZoo(); break;
                case 0: runCode = quitterProgramme(scanner); break;
                default:
                    separateuravecEspace();
                    System.out.println("Pas une option, desole!");
                    separateuravecEspace();
                    break;
            }            
        }
        }
    public static void showMenu(){
    separateuravecEspace();
    System.out.println("Bienvenue au zoo!");
    System.out.println("Que desirez vous faire?");
    separateuravecEspace();
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
    separateuravecEspace();
} 

    public static void ajouterNouveauAnimal(Scanner scanner) { // get scanner from main
        separateuravecEspace();
        System.out.println("Option 1, ajouter un nouvel animal:");
        while (true) {
            if (animalCount == animauxdata.length) {
                animauxdata = redimensionnerTableau(animauxdata); // resize table if full
            } separateuravecEspace();
            System.out.println("C'est quoi le nom de votre nouvel animal? (ecrivez 'Stop' pour arrêter)");
            String nomAnimal = scanner.nextLine();
            if (nomAnimal.isEmpty()) {
                System.out.println("Entrée non valide. Veuillez entrer un numéro.");
                break;
            }
            if (nomAnimal.equals("stop")) {
                break;
            } separateuravecEspace();

            System.out.println("C'est quoi l'espèce de votre nouvel animal?");
            String especeAnimal = scanner.nextLine();
            if (especeAnimal.isEmpty()) {
                System.out.println("Entrée non valide. Veuillez entrer une espèce.");
                break;
            } separateuravecEspace();

            System.out.println("C'est quoi le poids de votre nouvel animal en kg?");
            if (!scanner.hasNextDouble()) { /*condition if qui check si scanner n'a pas recu un double */ 
                System.out.println("Entrée non valide. Veuillez entrer un numéro.");
                break;
            }separateuravecEspace();

            double poidsAnimal = scanner.nextDouble(); // Read input as double
            scanner.nextLine(); // 

            if (poidsAnimal <= 0) { // Check if the weight is a positive number
                System.out.println("Votre poids ne peut pas être nul ou négatif");
                continue; // prompt again if poids is zero or negative
}

            animauxdata[animalCount][0] = nomAnimal; //mettre les dates dans la table
            animauxdata[animalCount][1] = especeAnimal;
            animauxdata[animalCount][2] = String.valueOf(poidsAnimal); // convert to string (storage)
            animalCount++;
            separateuravecEspace();
            System.out.println("Animal ajouté avec succès!");
            separateuravecEspace();
        }
    }
public static void rechercherAnimal(Scanner scanner) {
separateuravecEspace();
System.out.println("Choisissez un des critères pour faire une recherche:");
System.out.println("1. Nom");
System.out.println("2. Espèce");
System.out.println("3. Poids");
System.out.println("4. Sortir");
separateuravecEspace();

while (true) {
String input2 = scanner.nextLine();

// Verification if input is valid
while (!input2.equals("1") && !input2.equals("2") && !input2.equals("3") && !input2.equals("4")) {
    separateuravecEspace();
    System.out.println("Ceci n'est pas une entrée valide, veuillez choisir une option ");
    separateuravecEspace();
    break;
}

int option2 = Integer.parseInt(input2);
boolean found = false;
switch (option2) {
    case 1:
        separateuravecEspace();
        System.out.println("Entrez le nom de l'animal:");
        String nomRecherche = scanner.nextLine();
        if (nomRecherche.isEmpty()) {
            System.out.println("Entrée non valide. Veuillez entrer un nom.");
            return;
        }
        separateuravecEspace();

        System.out.println("Animaux avec le nom " + nomRecherche + ":");
        for (int i = 0; i < animalCount; i++) {
            if (animauxdata[i][0].equalsIgnoreCase(nomRecherche)) {
                afficherSingleAnimal(i);
                found = true;
                rechercherAnimal(scanner);
            }
        }
        if (!found) {
            System.out.println("Aucun animal trouvé avec ce nom.");
            rechercherAnimal(scanner);
        }
        break;

    case 2:
        separateuravecEspace();
        System.out.println("Entrez l'espèce de l'animal:");
        String especeRecherche = scanner.nextLine();
        if (especeRecherche.isEmpty()) {
            System.out.println("Entrée non valide. Veuillez entrer une espèce.");
            return;
        }
        separateuravecEspace();
        System.out.println("Animaux de l'espèce " + especeRecherche + ":");
        for (int i = 0; i < animalCount; i++) {
            if (animauxdata[i][1].equalsIgnoreCase(especeRecherche)) {
                afficherSingleAnimal(i);
                found = true;
                rechercherAnimal(scanner);
            }
        }
        if (!found) {
            System.out.println("Aucun animal trouvé de cette espèce.");
            return;
        }
        separateuravecEspace();
        break;

    case 3:
        separateuravecEspace();
        System.out.println("Entrez le poids de l'animal en kg:");
        String input = scanner.nextLine();
        if (input.isEmpty()) {
            System.out.println("Entrée non valide. Veuillez entrer un poids.");
            return;
        }
        double poidsRecherche;
        try {
            poidsRecherche = Double.parseDouble(input);
        } catch (NumberFormatException e) {
            System.out.println("Entrée non valide. Veuillez entrer un poids numérique.");
            return;
        }
        System.out.println("Animaux avec le poids " + poidsRecherche + ":");
        for (int i = 0; i < animalCount; i++) {
            if (Double.parseDouble(animauxdata[i][2]) == poidsRecherche) {
                afficherSingleAnimal(i);
                found = true;
                rechercherAnimal(scanner);
            }
        }
        if (!found) {
            System.out.println("Aucun animal trouvé avec ce poids.");
            return;
        }
        separateuravecEspace();
        break;

    case 4:
        System.out.println("Sortir.");
        break;

    default:
        separateuravecEspace();
        System.out.println("Pas une option, Bye!");
        separateuravecEspace();
        return;
}
break;
}
}
    

public static void afficherListeAnimaux() { //shows ALL animals in animauxdata
    separateuravecEspace();
    System.out.println("Nombre total d'animaux ajoutés: " + animalCount); // shows total animals added
    separateuravecEspace();

    for (int i = 0; i < animalCount; i++) {
        System.out.println("Animal " + (i + 1) + ":"); 
        System.out.println("  Nom: " + animauxdata[i][0]);     
        System.out.println("  Espèce: " + animauxdata[i][1]);  
        System.out.println("  Poids: " + animauxdata[i][2]);
        System.out.println("  Visiteurs: " + visiteurs[i]);   
        System.out.println();
    }
}
private static void afficherSingleAnimal(int index) {//shows details for A SINGLE animal  //this one is exclusively for rechercherAnimal, i dont know why afficherListeAnimaux is not working, i just made a new one it'd be easier this
    System.out.println("Animal " + (index + 1) + ":");
    System.out.println("  Nom: " + animauxdata[index][0]);
    System.out.println("  Espèce: " + animauxdata[index][1]);
    System.out.println("  Poids: " + animauxdata[index][2]);
    System.out.println("  Visiteurs: " + visiteurs[index]);
    separateuravecEspace();
}
public static void modifierPoidsAnimal(Scanner scanner) {
    separateuravecEspace();
    System.out.println("Nom de l'animal qui aura leur poids changé:");
    String nomAnimal = scanner.nextLine();
    boolean found = false;
    for (int i = 0; i < animalCount; i++) {
        if (animauxdata[i][0].equalsIgnoreCase(nomAnimal)) { // compare name
            System.out.println("nouveau poids pour " + nomAnimal + " en kg:");
            double newPoids = Double.parseDouble(scanner.nextLine());
            animauxdata[i][2] = String.valueOf(newPoids); // update weight as string
            System.out.println("Le poids de " + nomAnimal + " a été changé");
            found = true;
            break;
        }
    }
    if (!found) {
        System.out.println("Aucun animal avec ce nom.");
    }
    separateuravecEspace();
}
public static void ajouterVisiteursParAnimal(Scanner scanner) {
    separateuravecEspace();
    System.out.println("C'est quoi le nom de l'animal qui aura des visiteurs? :");
    String nomAnimal = scanner.nextLine();
    if (nomAnimal.isEmpty()) {
        System.out.println("Entrée non valide. Veuillez entrer une espèce.");
        ajouterVisiteursParAnimal(scanner);
        return;
    }
    boolean found = false;
    for (int i = 0; i < animalCount; i++) {
        if (animauxdata[i][0].equalsIgnoreCase(nomAnimal)) { // search by name
            System.out.println("Combien de visiteurs voulez-vous ajouter pour " + nomAnimal + "?");
            try {
                int newVisiteurs = Integer.parseInt(scanner.nextLine());
                if (newVisiteurs < 0) { // Check for negative numbers
                    System.out.println("Le nombre de visiteurs ne peut pas être négatif. Veuillez entrer un nombre positif.");
                    ajouterVisiteursParAnimal(scanner);
                    return;
                }
                visiteurs[i] += newVisiteurs; // ++new Visiteurs to the current total
                System.out.println("Nombre total de visiteurs pour " + nomAnimal + ": " + visiteurs[i]);
            } catch (NumberFormatException e) {
                System.out.println("Entrée non valide. Veuillez entrer un nombre.");
                ajouterVisiteursParAnimal(scanner);
            found = true;
            break;
        }
    }
    if (!found) {
        System.out.println("Aucun animal trouvé avec ce nom.");
    }
}
}
public static void calculerTotalVisiteursZoo() {
    int totalVisitors = 0;
    for (int i = 0; i < animalCount; i++) {
        totalVisitors += visiteurs[i];
    }
    System.out.println("Le total de visiteurs dans le zoo est de: " + totalVisitors);
    separateuravecEspace();
}
//NOT GONNA LIE apres certain point c'est just la meme affaire, fait une table, for loop pour le naviger, n'importe quel variable, change la variable a ce que je cherche
public static void calculerPoidsMoyenAnimaux() {
    separateuravecEspace();
    if (animalCount == 0) {
        System.out.println("Il n'y a pas d'animaux pour calculer une moyenne.");
        return;
    }
    double totalWeight = 0.0;
    for (int i =0; i < animalCount;i++) {
        totalWeight += Double.parseDouble(animauxdata[i][2]); // parse and add each weight
    }
    double averageWeight =totalWeight/ animalCount; // calculate average weight
    System.out.println("le poids moyen des animaux est de: " + averageWeight + " kg");
    separateuravecEspace();
}
public static void trouverAnimauxExtremes() {
    separateuravecEspace();
    if (animalCount == 0) {
        System.out.println("Il n'y a pas d'animaux.");
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
    System.out.println("  Nom: " + animauxdata[heaviestIndex][0]);
    System.out.println("  Espèce: " + animauxdata[heaviestIndex][1]);
    System.out.println("  Poids: " + animauxdata[heaviestIndex][2] + " kg");
    System.out.println();

    // light animal
    System.out.println("animal plus leger:");
    System.out.println("  Nom: " + animauxdata[lightestIndex][0]);
    System.out.println("  Espèce: " + animauxdata[lightestIndex][1]);
    System.out.println("  Poids: " + animauxdata[lightestIndex][2] + " kg");
    separateuravecEspace();
}
public static void afficherResumeCompletZoo() {
    separateuravecEspace();
    System.out.println("<---------------- Resume du Zoo ---------------->");

    System.out.println("Total de Visiteurs:");
    calculerTotalVisiteursZoo();

    System.out.println("Liste d'animaux:");
    afficherListeAnimaux(); 
    
    System.out.println("poids moyen des animaux:");
    calculerPoidsMoyenAnimaux();

    System.out.println("l'animaux plus lourd et le plus leger:");
    trouverAnimauxExtremes();

    System.out.println("<---------------- fin du resume ---------------->");
    separateuravecEspace();
}
public static boolean quitterProgramme(Scanner scanner) {
    separateuravecEspace();
    System.out.println("etez vous sûr(e) de vouluoir quitter le zoo?");
    System.out.println("options:");
    System.out.println("1: Non");
    System.out.println("2: Oui");
        String input0 = scanner.nextLine();
        int choix = Integer.parseInt(input0);
        boolean result = true;


    switch (choix) {
        case 1:
        System.out.println("you silly goose!");
        result = true;
            break;

        case 2:
        System.out.println("bye-bye!");
        result = false;
            break;
    }
    return result;
}
public static String[][] redimensionnerTableau(String[][] animauxData) {
    String[][] tablePlusGrand = new String[animauxData.length * 2][3];
    for (int i = 0; i < animauxData.length; i++) {
        tablePlusGrand[i] = animauxData[i];
    }
    return tablePlusGrand;
}
public static void separateuravecEspace(){
    System.out.println("");
    System.out.println("<-------------------------------------------------------->");
    System.out.println("");
}
}