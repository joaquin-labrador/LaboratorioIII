
import Exercise1.Rectangle;
import Exercise2.Employee;
import Exercise3.Item;
import Exercise4.BankAccount;
import Exercise5.Hour;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n==== Exercise 1 ==== \n");
        Rectangle R = new Rectangle(20, 10);
        System.out.println(R);

        System.out.println("\n==== Exercise 2 ==== \n");
        Employee E1 = new Employee(23456345, "Carlos", "Gutierrez", 25000);
        Employee E2 = new Employee(34234123, "Ana", "Sanchez", 27500);
        System.out.println(E1);
        System.out.println(E2);
        double P = 15; // Aumento de salario de carlos
        E1.payRise(E1.salary, P);
        System.out.println("New salary of " + E1.getName() + " is " + E1.getSalary());
        System.out.println("Annual Salary of " + E1.getName() + " " + E1.anualSalary(E1.salary));

        System.out.println("\n==== Exercise 3 ==== \n");
        Item goudaChesse = new Item(12654, "Foodstuffs", 180, 3.25);
       // System.out.println(goudaChesse.hashCode()); direccion de memoria del objeto
        System.out.println(goudaChesse);

        System.out.println("\n==== Exercise 4 ==== \n");
        BankAccount bA1 = new BankAccount(41458511, "Joaquin Labrador", 15000);
        bA1.creditDeposit(2500);
        System.out.println(bA1);
        bA1.creditDeposit(1500);
        System.out.println(bA1);
        bA1.debitPay(30000);
        System.out.println(bA1);

        System.out.println("\n==== Exercise 5 ==== \n");
        Hour W = new Hour(13, 4, 22);
        for (int i = 0; i < 40; i++) {
            W.downSecond();
            System.out.println(W);
        }

    }


}
