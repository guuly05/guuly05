import java.util.*;
public class bankai2 {
    String lname;
    double balance;
    public bankai2(){
    }

    public String getLname() {
        return lname;
    }

    public double getBalance() {
        return balance;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public bankai2(String lname) {
        this.lname = lname;
    }

    public  bankai2(String kname, double balance){
        lname = kname;
       this.balance = balance;
    }
    public void deposit(double amount){
        if (amount > 0)
            balance += amount;
    }
    public void withdraw(double amount){
        if (balance >= amount)
        balance -= amount;
        else
            System.out.println("error ");
    }

    }



