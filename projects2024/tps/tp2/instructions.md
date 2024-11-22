
Jeu des Mines Fleuries - Instructions Complètes

### Objectif du Projet
Créer un jeu interactif où l'utilisateur récolte des fleurs sur un terrain miné, tout en évitant les mines. Le jeu se termine soit lorsque toutes les fleurs ont été récoltées, soit lorsque l'utilisateur tombe sur une mine.

### Étapes Principales à Réaliser

1. **Génération du Terrain**
   - Représenter le terrain comme un tableau 2D.
   - Définir la taille du terrain et le nombre de mines/fleurs selon le niveau de difficulté choisi par l'utilisateur :
     - Niveau facile : 25 cases
     - Niveau moyen : 100 cases
     - Niveau difficile : taille choisie par l'utilisateur (≥ 100 cases).
   - Positionner les mines et les fleurs aléatoirement.
   - S'assurer qu'il n'y a pas de cases nulles dans le tableau.
   - Le terrain devra contenir 25% de mines, et 45% de fleurs, tous distribuées aléatoirement.Un niveau facile aura donc 6 mines et 11 fleurs positionnés aléatoirement sur un terrain de 25 cases.

2. **Déroulement de la Partie**
   - Permettre à l'utilisateur d'entrer des coordonnées pour tenter de découvrir une case.
   - Rétroactions possibles :
     - "Youpi !!!" : Fleur trouvée.
     - "Fiouuu..." : Case vide.
     - "Oh non 😞" : Mine trouvée, fin de la partie.
   - Continuer le jeu tant qu'une mine n'est pas découverte et qu'il reste des fleurs.

3. **Affichage**
   - Afficher la carte secrète à chaque tour, en utilisant les symboles suivants :
     - `X` : Cases non découvertes.
     - `~` : Cases vides découvertes.
     - `✿` : Cases contenant des fleurs découvertes.
   - À la fin de la partie, révéler la carte complète avec la position des mines et des fleurs.

4. **Statistiques**
   - À la fin de la partie, afficher :
     - Le nombre de coups joués.
     - Le nombre de fleurs récoltées.
     - La carte complète avec toutes les positions dévoilées.

5. **Validation des Entrées**
   - Vérifier que les coordonnées entrées par l'utilisateur sont valides.
   - En cas d'erreur, afficher un message clair et permettre de réessayer.

6. **Structuration du Code**
   - Utiliser des méthodes statiques pour organiser le code.
   - Diviser les fonctionnalités en méthodes distinctes avec des responsabilités uniques.
   - Nommer les variables et méthodes de manière claire et significative (ex : camelCase).

7. **Documentation**
   - Ajouter des commentaires clairs pour expliquer chaque partie du code.
   - Indenter et structurer le code pour le rendre lisible.

8. **Gestion des Erreurs**
   - Utiliser des blocs `try-catch` pour gérer les exceptions potentielles (ex : entrées invalides).

9. **Améliorations Optionnelles**
   - Ajouter des fonctionnalités supplémentaires pour enrichir l'expérience utilisateur.
   - Améliorer l'interface utilisateur.

### Critères d'Évaluation
1. Fonctionnalité et complétion (40 points)
   - Gestion des niveaux de difficulté.
   - Génération correcte du terrain.
   - Réactivité aux entrées utilisateur.
   - Affichage des statistiques.

2. Structure du code (30 points)
   - Utilisation appropriée des méthodes.
   - Optimisation des structures conditionnelles et des boucles.
   - Éviter les duplications de code.

3. Qualité du code (15 points)
   - Lisibilité et nomenclature.
   - Documentation claire.

4. Gestion des erreurs et validation (15 points)
   - Validation des entrées.
   - Gestion des exceptions.

5. Originalité (5 points)
   - Fonctionnalités supplémentaires ou améliorations.

### Notes
Respectez les meilleures pratiques enseignées en classe. Structurez le programme clairement et testez-le pour garantir son bon fonctionnement avant de le soumettre.
