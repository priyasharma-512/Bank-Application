public interface BankInterface {

    double checkBalance(int amount);
    String addMoney(int amount);
    String withdrawMoney(int amount, String password);
    double interest(int years);
}
