/*
LABRIX 2022
 */

package Book.author;

public class Author {
    protected String name;
    protected String lastName;
    protected char Sex;

    public Author() {

    }

    public Author(String name, String lastName, char sex) {
        this.name = name;
        this.lastName = lastName;
        Sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }


    public char getSex() {
        return Sex;
    }


    @Override
    public String toString() {
        return " Autor { " + " name= '" + name + '\'' + ", lastName= '" + lastName + '\'' + ", Sex= " + Sex + "\n" + '}';
    }
}
