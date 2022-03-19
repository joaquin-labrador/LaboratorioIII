package Exercise2;

public class Employee {
    //dni, nombre,
    //apellido y salario
    private int ID;
    private String name;
    private String lastName;
    public double salary;

    public Employee() {

    }

    public Employee(int ID, String name, String lastName, double salary) {
        this.ID = ID;
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double anualSalary(double S) {
        return S * 12;
    }

    public double payRise(double S, double P) {
        return salary += (S * (P / 100));
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID = " + ID +
                ", name = '" + name + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", salary = " + salary +
                '}';
    }
}
