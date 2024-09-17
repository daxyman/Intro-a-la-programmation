public class trace{
    public static void main(String[] args) {
        int [] numbers = {5, 12, 7, 3 ,9}; //numbers table
        int sum = 0;
        int i = 0;

        //boucle "while" to go through the table
        while (i < numbers.length){
            if (numbers [i] % 2 == 0) { //si le nombre est pair
                sum += numbers [i]; //ajouter les nombres paires a la somme
            } else { //sinon afficher que le nombre est pair
                System.out.println(numbers[i] + " est impair");
            }
            i++; //incrementer l'indice
        }
//afficage de la somme des nombres pairs
System.out.println("la somme des nombres pairs est: " + sum);
    }
}