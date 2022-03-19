
import Exercise1.Rectangle;
import Exercise2.Employee;

public class Main {
    public static void main(String[] args) {
        //Exercise 1
        System.out.println("\n==== Exercise 1 ==== \n");
        Rectangle R = new Rectangle(20, 10);
        System.out.println(R);

        //Exercise 2
        System.out.println("\n==== Exercise 2 ==== \n");
        Employee E1 = new Employee(23456345, "Carlos", "Gutierrez", 25000);
        Employee E2 = new Employee(34234123, "Ana", "Sanchez", 27500);
        System.out.println(E1);
        System.out.println(E2);
        double P = 15; // Aumento de salario de carlos
        E1.payRise(E1.salary, P);
        System.out.println("New salary of " + E1.getName() + " is " + E1.getSalary());
        System.out.println("Annual Salary of " + E1.getName() + " " + E1.anualSalary(E1.salary));

    }


}
