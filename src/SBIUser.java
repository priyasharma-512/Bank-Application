import java.util.Objects;
import java.util.UUID;

public class SBIUser implements BankInterface{

    //attributes
    private String name;
    private String password;
    private double balance;
    private double rateOfInterest;
    private String accountNo;

    public SBIUser(String name, String password, double balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;

        //bank is intialising these values
        this.rateOfInterest = 6.7;
        this.accountNo = String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    @Override
    public double checkBalance(int amount) {
        return balance;
    }

    @Override
    public String addMoney(int amount) {
        balance = balance + amount;
        return "The balance is : "+getBalance();
    }

    @Override
    public String withdrawMoney(int amount, String passwordgiven) {
        if(Objects.equals(passwordgiven,password))
        {
            if(amount > balance) {
                return "sorry no sufficient balance!";
            }
            else{
                balance -= amount;
                return "amount debited!";
            }
        }

            return "sorry, wrong password entered";
    }

    @Override
    public double interest(int years) {
        return (years * balance * rateOfInterest) / 100;
    }


}
