package lesson_25.banksystem;

public interface PaymentSystem {

    boolean withdrawMoney(double amount);

    void depositTransfer(double amount);

    double checkBalance();

    boolean transferMoney(double amount, PaymentSystem recipient);

    String getCurrency();

    String getTitle();
}
