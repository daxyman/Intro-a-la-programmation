package date_2024_11_01;

public class notes {
    public static void main(String[] args) {
        int x = 8;
        boolean result = estpremier(x);
        if (result) {
            System.out.println(x + " est pair");
        } else {
            System.out.println(x + " est impair");
        }
    }

    public static boolean estpremier(int x) {
        boolean state = false;
        if (x % 2 == 0) {
            state = true;
        }
        return state;
    }
}
