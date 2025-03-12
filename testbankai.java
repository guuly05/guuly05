
public class testbankai {
    public static void main(String[] args) {
        bankai2 bank = new bankai2("guuleed", 300);
        System.out.println("name is: " + bank.getLname() + " balance is " + bank.getBalance());
        bank.deposit(3);
        System.out.println("balance after deposite is: " + bank.balance);
        bank.withdraw(3000);
        System.out.println("balance after withdrawl is: " + bank.balance);
    }
}
