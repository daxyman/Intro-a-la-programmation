package date_2024_12_03;
import java.io.File;
import java.io.IOException;

public class notes2 {
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
}
