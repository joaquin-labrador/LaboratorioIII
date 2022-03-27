package UserBank.BankAccount;
import java.util.UUID;
import UserBank.UserBank;
public class BankAccount {
    private UUID accountID;
    private double balance;
    private UserBank client;

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
        if(money >= 0)
            this.balance += money;
        else{
            money *= (-1);
            if(money > this.balance){
                System.out.println("insufficient balance");
            }
            else{
                this.balance -= money;
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
