public class trace{
    public static void main(String[] args) {
        int [] numbers = {6, 12, 52, 0 ,15, 48}; //numbers table
        int sum = 0;
        int i = 0;

        //boucle "while" to go through the table
        while (i < numbers.length){
            if (numbers [i] % 3 == 0) { //si le nombre est multiple de 3
                sum += numbers [i]; //ajouter les nombres a la somme
            }
            i++; //incrementer l'indice
        }
//afficage de la somme des nombres pairs
System.out.println("la somme des nombres multiples de 3 est: " + sum);
    }
}