public class revision {
    public static void main(String[] args){
        double[] price = new double[3];
        price[0] = 5.99;
        price[1] = 10.99;
        price[2] = 15.99;

        for(int s=0; s<price.length; s++) {
            System.out.println("le prix de l'article "+ s + "est "+ price[s]);
        }
    }
}