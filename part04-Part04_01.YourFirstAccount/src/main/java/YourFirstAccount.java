
public class YourFirstAccount {

    public static void main(String[] args) {
        Account jeffsAccount = new Account("Jeff" , 100.00);
        
        jeffsAccount.deposit(20.0);
        
        System.out.println(jeffsAccount);
    }
}
