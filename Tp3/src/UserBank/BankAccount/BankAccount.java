package UserBank.BankAccount;

import java.util.UUID;

import UserBank.UserBank;

public class BankAccount {
    private UUID accountID;
    private double balance;
    private UserBank client;
    static double MAX_DEBT = -2000;

    public BankAccount() {
    }

    public BankAccount(double balance, UserBank client) {
        this.accountID = UUID.randomUUID();
        this.balance = balance;
        this.client = client;
    }

    public UserBank getClient() {
        return client;
    }

    public void setBalance(double money) {
        if (money >= 0)
            this.balance += money;
        else {
            double verification = this.balance + money; // Verifico para el saldo deudor de -2000
            if (verification > MAX_DEBT) {
                this.balance = verification;
            } else {
                System.out.println("-----Insufficient balance-----");
            }

        }


    }

    @Override
    public String toString() {
        return "BankAccount{ " +
                "accountID : " + accountID +
                ", balance : " + balance +
                ", client : " + client +
                '}';
    }
}
