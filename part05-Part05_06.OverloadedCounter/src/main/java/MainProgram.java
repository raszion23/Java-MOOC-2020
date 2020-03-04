
public class MainProgram {

    public static void main(String[] args) {
        Counter alpha = new Counter();
        Counter beta = new Counter(10);
        
        System.out.println(alpha);
        System.out.println(beta);
        
        alpha.increase();
        beta.decrease(8);
        
        System.out.println(alpha);
        System.out.println(beta);
    }
}
