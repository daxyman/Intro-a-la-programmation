package date_2024_12_03;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class notes3 {
public static void main(String[] args){
File myFile = new File("example.txt"); // création de l'objet File
// 1. Vérification de l'existence du fichier
if (myFile.exists()) {
System.out.println("Le fichier existe déjà.");
} else {
// 2. Création du fichier si nécessaire
try {
if (myFile.createNewFile()) {
System.out.println("Fichier créé : " + myFile.getName());
} else {
System.out.println("Le fichier n'a pas pu être créé.");
}
} catch (IOException e) {
// 3. Gestion des erreurs
System.out.println("Une erreur est survenue lors de la création du fichier.");
e.printStackTrace();
}
}
            
}
public static void ecrireFichier(String nomFichier) {
    try {// création (ou ouverture) du fichier
        FileWriter writer = new FileWriter("example.txt"); 						
        writer.write("Bonjour, ceci est un exemple d'écriture dans un fichier.");				
        writer.close(); // Fermeture du fichier
        System.out.println("Écriture réussie dans le fichier.");
    } catch (IOException e) {
        System.out.println("Une erreur est survenue lors de l'écriture.");
        e.printStackTrace();
    }
}

}
