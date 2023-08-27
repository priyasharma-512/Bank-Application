import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name, password, balance to create account");

        //create a user
        String name = sc.nextLine();
        String password = sc.nextLine();
        double balance = sc.nextDouble();

        //create SBI account
        SBIUser acc1 = new SBIUser(name,password,balance);
        System.out.println("The new SBI account is : "+acc1.getAccountNo());

        //add money
        System.out.println("Enter the money you want to add: ");
        int amt = sc.nextInt();
        acc1.addMoney(amt);


        //check balance
        double newBalance = acc1.getBalance();
        System.out.println("Now account balance is: "+newBalance);

        //withdraw money
        System.out.println("Enter amount you want to withdraw: ");
        int money = sc.nextInt();
        System.out.println("Enter password: ");
        String pass = sc.next();
        String amountdrawn = acc1.withdrawMoney(money,pass);
        System.out.println(amountdrawn);
        System.out.println("New balance is : "+acc1.getBalance());

        //rate of interest
        System.out.println("The interest for 10 years on " +acc1.getBalance()+" Rs will be " + acc1.interest(10));

    }
}