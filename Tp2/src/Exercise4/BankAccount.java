package Exercise4;

public class BankAccount {
    private int ID;
    private String name;
    private double balance;

    public BankAccount() {
    }

    public BankAccount(int ID, String name, double balance) {
        this.ID = ID;
        this.name = name;
        this.balance = balance;
    }
    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void creditDeposit(double credit) {
        this.balance += credit;

    }

    public void alert() {
        System.out.println("You don't have funds");
    }

    public void debitPay(double debit) {
        if (balance >= debit) {
            this.balance -= debit;
        }
        else {
            alert();
        }


    }

    @Override
    public String toString() {
        return "BankAccount { " +
                "ID= " + ID +
                ", name= '" + name + '\'' +
                ", balance= " + balance +
                '}';
    }
}
