package Exercise2.SystemControlSchool.Person.Students;

import Exercise2.SystemControlSchool.Person.Person;

public class Students extends Person {
    private int yearIncome;
    private float fee;
    private String career;

    public Students() {
    }

    public Students(String name, String lastName, int id, int yearIncome, float fee, String career) {
        super(name, lastName, id);
        this.yearIncome = yearIncome;
        this.fee = fee;
        this.career = career;

    }

    public float getFee() {
        return fee;
    }

    @Override
    public String toString() {
        return super.toString() + "income year: " + yearIncome + " career: " + career + " fee: " + fee;
    }
}
