import Book.Book;
import Book.autor.Autor;
import Cliente.Client;
import Cliente.invoice.Item.Item;
import Cliente.invoice.Invoice;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //exercise1();
        exercise2();



    }
    public static void exercise1(){
        Autor [] singleAuthor = new Autor[1];//Autor individual
        Autor author = new Autor("Joshua","Bloch","joshua@email.com",'M');
        singleAuthor[0] = author;
        Book book = new Book("Effective Java", 450, 150, singleAuthor);
        book.sumBooks(50);
        book.sumPrice(50);
        System.out.println(book);


        //1H

        //Creo un arrays de autores e instancio un array de una clase (Autores)
        Autor[] autores = new Autor[2];
        autores[0] = author;
        Autor autor2 = new Autor("Joaquin", "Labrador", "Holacomova@gmail.com", 'M');
        autores[1] = autor2;
        Book bookH = new Book("Effective Java Two ", 700, 170, autores);//Creo un nuevo libro con dos auures
        book.setAutores(autores);//Le agrego el segundo autor al primer libro
        System.out.println("First book + New autor \n");
        System.out.println(book);
        System.out.println("Second book\n");
        System.out.println(bookH);
        System.out.println(bookH.forSell());

    }

    public static void exercise2(){
        char s = 's';
        Scanner sc = new Scanner(System.in);
        Client client1 = new Client("Joaquin","JoaquinLabrador@gmial.com",50);
        //Creo los productos que se van a cobrar
        Invoice invoice = new Invoice(client1);

        do{
            System.out.println("Enter price\n");
            int price = sc.nextInt();
            sc.nextLine();
            System.out.println("Product name\n");
            String name = sc.nextLine();
            Item product = new Item(price,name);
            invoice.setItems(product);
            System.out.println("Continue?\n");
            s = sc.next().charAt(0);
        }while (s == 's');

//        products[0] = new Item(256,"Meat","Pig Meat",3);
//        products[1] = new Item(206,"Fruit","Kiwi",110);
//        products[2] = new Item(139,"Bread","Potato bread",82);
       //Creo la factura depues de asignar los productos
        System.out.println(invoice);
    }
}
