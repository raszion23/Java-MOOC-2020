
public class Main {

    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(30, 12, 2020);
        System.out.println(date);
        
        SimpleDate newDate = date.afterNumberOfDays(7);
        System.out.println(newDate);
        
        System.out.println(date);
    }
}
