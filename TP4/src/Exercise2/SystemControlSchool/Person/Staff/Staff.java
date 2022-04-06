package Exercise2.SystemControlSchool.Person.Staff;

import Exercise2.SystemControlSchool.Person.Person;

public class Staff extends Person {
    private float salary;
    private boolean shift;
    private String turn;

    public Staff() {
    }

    public Staff(String name, String lastName, int id, float salary, boolean shift) {
        super(name, lastName, id);
        this.salary = salary;
        this.shift = shift;
        if (shift) {
            this.turn = "Morning";
        } else {
            this.turn = "Afternoon";
        }
    }

    public float getAnnualSalary() {
        return this.salary * 13; // Cuento aginaldo
    }

    @Override
    public String toString() {
        return super.toString() + "shift: " + turn + " annual salary: " + getAnnualSalary();
    }
}
