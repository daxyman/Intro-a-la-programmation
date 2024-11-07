S10 - Exercices préparatoires pour l'examen 02
1. Vérificateur de voyelles
Objectif : Écrire un programme Java qui vérifie si un mot donné contient au moins une voyelle.
Consignes :
Demandez à l’utilisateur de saisir un mot.
Utilisez la méthode charAt() pour parcourir chaque caractère du mot.
Vérifiez si le mot contient au moins une voyelle (a, e, i, o, u, y).
Affichez un message indiquant si le mot contient des voyelles ou non.
Structurez votre code en créant une méthode séparée pour vérifier la présence de voyelles.
Exemple de sortie :
Entrée : "chat"

Sortie : "Le mot contient des voyelles."
Entrée : "pfff"

Sortie : "Le mot ne contient pas de voyelles."
2. Calculateur de jours dans un mois
Objectif : Écrire un programme Java qui demande à l'utilisateur de saisir un chiffre entre 1 et 12 (correspondant au mois de l’année) et retourne le nombre de jours dans ce mois.
Consignes :
Demandez à l’utilisateur de saisir un chiffre entre 1 et 12.
Utilisez une structure de contrôle (comme switch ou if-else) pour retourner le nombre de jours en fonction du mois.
Affichez le résultat sous la forme : "Le mois [numéro] a [nombre de jours] jours."
Structurez votre code en créant une méthode séparée pour obtenir le nombre de jours dans un mois.
Exemple de sortie :
Entrée : 1

Sortie : "Le mois 1 a 31 jours."
Entrée : 2

Sortie : "Le mois 2 a 28 jours."
3. Déterminateur de signe astrologique
Objectif : Écrire une méthode Java qui reçoit un mois et un jour en paramètre et retourne le signe astrologique associé.
Consignes :
Créez une méthode getSigneAstrologique(int mois, int jour) qui prend en paramètre le mois et le jour.
Utilisez des conditions pour déterminer le signe astrologique en fonction de la date.
Si le mois ou le jour est invalide, retournez "invalide".
Affichez le résultat dans le programme principal.
Exemple de signes :
Capricorne : 22/12 au 20/1
Verseau : 21/1 au 19/2
Poissons : 20/2 au 20/3
Bélier : 21/3 au 20/4
Taureau : 21/4 au 20/5
Exemple de sortie :
Entrée : Mois = 3, Jour = 15

Sortie : "Le signe astrologique est Poissons."
Entrée : Mois = 13, Jour = 10

Sortie : "invalide"
4. Inversion de casse
Objectif : Utiliser les classes Java Character et String pour transformer tous les caractères majuscules en minuscules et vice versa, sauf le premier caractère qui doit toujours être en majuscule.
 
Exemple de sortie :
Entrée : "Bonjour"

Sortie : "Bonjour"
Entrée : "jAVA eST pASSIONNANT"

Sortie : "Java est passionnant"
5. Compteur de mots
Objectif : Écrire un programme qui compte et affiche le nombre de mots dans une phrase entrée par l'utilisateur.
Consignes :
Demandez à l’utilisateur de saisir une phrase.
Utilisez la méthode split() de String pour découper la phrase en mots.
Comptez le nombre de mots et affichez le résultat sous la forme : "Nombre de mots : [nombre]".
Exemple de sortie :
Entrée : "Java est un langage de programmation"

Sortie : "Nombre de mots : 6"
6. Générateur de mots de passe
Objectif : Écrire une méthode Java qui génère aléatoirement des mots de passe ayant les caractéristiques suivantes.
Consignes :
Un mot de passe doit avoir une taille comprise entre 6 et 10 caractères.
Un mot de passe doit avoir au moins :
Un chiffre
Deux lettres majuscules
Une lettre minuscule
Un seul caractère spécial parmi : ;, _, ?, $, !
Créez une méthode static String genererMotDePasse() pour générer le mot de passe.
Utilisez les classes Random et StringBuilder pour construire le mot de passe.
Exemple de sortie :
Sortie possible : "A9b_R4"
Ces exercices vous permettent de pratiquer plusieurs concepts en Java tels que la manipulation de chaînes de caractères, la gestion des conditions, et l'utilisation de méthodes. Assurez-vous de bien structurer votre code en suivant les bonnes pratiques enseignées en classe.
 
Je vous rappelle que les notions acquises lors des exercices peuvent être sujettes à examen. Je vous encourage donc fortement à faire tous les exercices pour vous préparer à l'examen 02.
 
 