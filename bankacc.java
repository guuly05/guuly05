import java.util.Scanner;

public class bankacc {
    public int accnum;
    public static String bankname = "dahabshill";
    public static double  intrest = 0.02;
    public int balance = 1000;
    bankacc(){

    }
    bankacc(int n ){
        accnum = n;

    }

public void changeacc(String n, double m){
        bankname = n;
        intrest = m;
}

    public void printinfo(){
        System.out.println("----------------------------------------");
        System.out.println("your bank name is " + bankname);
        System.out.println("your acc number is: " +accnum );
        System.out.println("your balance is:" + balance);
        System.out.println("intrest is : " + intrest);
        System.out.println("----------------------------------------");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        bankacc b = new bankacc(2329388);
        b.printinfo();
        System.out.println("would you like to change the bank name or intrest rate? 1 for yes 2 for no : ");
        int choice = scanner.nextInt();

        if (choice == 1){
                System.out.println("enter new bank name and intrest: ");
                b.changeacc(scanner.next(), scanner.nextDouble());
                b.printinfo();
        }
        else
            System.out.println("thanks for using our system :) ");


    }
}
