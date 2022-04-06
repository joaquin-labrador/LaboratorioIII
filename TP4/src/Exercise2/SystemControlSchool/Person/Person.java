package Exercise2.SystemControlSchool.Person;


public abstract class Person {
    private String name;
    private String lastName;
    private int Id;


    public Person() {
    }

    public Person(String name, String lastName, int id) {
        this.name = name;
        this.lastName = lastName;
        Id = id;
    }

    @Override
    public String toString() {
        return "name: '" + name + '\'' +
                ", lastName: '" + lastName + '\'' +
                ", Id: " + Id +
                ' ';
    }
}
