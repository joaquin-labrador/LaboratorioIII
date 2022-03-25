import Book.Book;
import Book.author.Author;
import Cliente.Client;
import Cliente.invoice.Item.Item;
import Cliente.invoice.Invoice;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

        exercise1();

        //exercise2();



    }
    public static void exercise1(){
        Scanner sc = new Scanner(System.in);
        Book book = new Book("Effective Java", 450, 150);
        char s = 's';
        do{
            System.out.println("Enter the name of the author");
            String name = sc.nextLine();
            System.out.println("Enter the lastname of the author");
            String lastName = sc.nextLine();
            char sex;
            do {
                System.out.println("Enter the sex of the author(f | m | x)");
                sex = sc.nextLine().charAt(0);
            }while(sex != 'f' && sex != 'm' && sex != 'x');
            Author author = new Author(name,lastName,sex);//Creo el autor
            book.setAutores(author);//Asigno el autor al libro
            System.out.println("More authors?");
            s = sc.nextLine().charAt(0);
        }while(s == 's');

        //System.out.println(book);
        System.out.println(book.forSell());



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
