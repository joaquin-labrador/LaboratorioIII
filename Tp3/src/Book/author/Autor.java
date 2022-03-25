package Book.autor;


public class Autor {
    protected String name;
    protected String lastName;
    protected String eMail;
    protected char Sex;

    public Autor() {

    }

    public Autor(String name, String lastName, String eMail, char sex) {
        this.name = name;
        this.lastName = lastName;
        this.eMail = eMail;
        Sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public char getSex() {
        return Sex;
    }


    @Override
    public String toString() {
        int i = 0;
        return " Autor { " +
                "name= '" + name + '\'' +
                ", lastName= '" + lastName + '\'' +
                ", eMail= '" + eMail + '\'' +
                ", Sex= " + Sex + "\n" +
                '}';
    }
}
