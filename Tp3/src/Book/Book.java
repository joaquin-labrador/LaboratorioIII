/*
LABRIX 2022
 */

package Book;

import Book.author.Author;

import java.util.ArrayList;

public class Book {
    private String title;
    private double price;
    private int stock;
    private ArrayList<Author> authors = new ArrayList<Author>();

    public Book() {
    }

    public Book(String title, double price, int stock) {
        this.title = title;
        this.price = price;
        this.stock = stock;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    public ArrayList<Author> getAutors() {
        return authors;
    }

    public void setAutores(Author author) {
        authors.add(author);
    }


    public void sumBooks(int B) {
        this.stock += B;
    }

    public void sumPrice(int P) {
        this.price += P;
    }

    @Override
    public String toString() {
        return "Book{" + "title='" + title + '\'' + ", price=" + price + ", stock=" + stock + ", autores=" + authors.toString() + '}';
    }

    public String forSell() {
        /*CLASE Los objetos de éste tipo son mutables. Esto es una diferencia con los String.
         * Debe crearse con alguno de sus costructores asociados.STRINGBUILDER
         * Su tamaño y contenido pueden modificarse.
         * Un StringBuilder está indexado. Cada uno de sus caracteres tiene un índice: 0 para el primero,1 para el segundo, etc.
         * */
        StringBuilder names = new StringBuilder();
        for (Author author : authors) {
            names.append(author.getName());
            names.append(" ");
            names.append(author.getLastName());
            names.append(", ");
        }
        return "THE BOOK " + title + " OF " + names + "IT COSTS " + price + "$";
    }


}

