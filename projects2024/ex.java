public class ex {
    public static void main(String[] args) {

        for(int i=1; i<101; i++) {
        
        if(i%3==0 && i%5==0) {
        System.out.println("pingpong");
        }else if(i%3==0) {
        System.out.println("ping");
        }else if(i%5==0) {
        System.out.println("pong");
        }else{System.out.println(i);}
        
        }
        
        }
        
        
}
