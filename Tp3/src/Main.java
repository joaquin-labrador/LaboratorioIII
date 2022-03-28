import Book.Book;
import Book.author.Author;
import Cliente.Client;
import Cliente.invoice.Item.Item;
import Cliente.invoice.Invoice;
import UserBank.*;
import UserBank.BankAccount.BankAccount;

import java.net.PortUnreachableException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("-_-_-_-Welcome to TP3-_-_-_-");
        //exercise1();

        //exercise2();

        exercise3();


    }

    public static void exercise1() {
        Scanner sc = new Scanner(System.in);
        Book book = new Book("Effective Java", 450, 150);
        char s;
        do {
            System.out.println("Enter the name of the author");
            String name = sc.nextLine();
            System.out.println("Enter the lastname of the author");
            String lastName = sc.nextLine();
            char sex;
            do {
                System.out.println("Enter the sex of the author(f | m | x)");
                sex = sc.nextLine().charAt(0);
            } while (sex != 'f' && sex != 'm' && sex != 'x');
            Author author = new Author(name, lastName, sex);//Creo el autor
            book.setAutores(author);//Asigno el autor al libro
            System.out.println("More authors?");
            s = sc.nextLine().charAt(0);
        } while (s == 's');

        //System.out.println(book);
        System.out.println(book.forSell());


    }

    public static void exercise2() {
        char s;
        Scanner sc = new Scanner(System.in);
        Client client1 = new Client("Joaquin", "JoaquinLabrador@gmial.com", 50);
        //Creo los productos que se van a cobrar
        Invoice invoice = new Invoice(client1);

        do {
            System.out.println("Enter price\n");
            int price = sc.nextInt();
            sc.nextLine();
            System.out.println("Product name\n");
            String name = sc.nextLine();
            Item product = new Item(price, name);
            invoice.setItems(product);
            System.out.println("Continue?\n");
            s = sc.next().charAt(0);
        } while (s == 's');

//        products[0] = new Item(256,"Meat","Pig Meat",3);
//        products[1] = new Item(206,"Fruit","Kiwi",110);
//        products[2] = new Item(139,"Bread","Potato bread",82);
        //Creo la factura depues de asignar los productos
        System.out.println(invoice);
    }

    public static void exercise3() {
        Scanner sc = new Scanner(System.in);
        UserBank client = new UserBank("joa.89", 'm');
        BankAccount bankAccount1 = new BankAccount(10000, client);
        bankOperations(bankAccount1);
        System.out.println(bankAccount1);

    }

    public static void bankMenu(UserBank menuClient) {
        System.out.println("1 Deposit money");
        System.out.println("2 Retire money");
        System.out.println("3 Bank history");
        System.out.println("4 Exit");
        System.out.println("Select an option");
    }

    public static void bankOperations(BankAccount account) {
        int op;
        Scanner sc = new Scanner(System.in);
        System.out.println("----Welcome------");
        double money;
        do {
            bankMenu(account.getClient());
            op = sc.nextInt();
            switch (op) {
                case 1 -> {
                    System.out.println("Enter a money to deposit");
                    money = sc.nextDouble();
                    account.setBalance(money);
                }
                case 2 -> {
                    System.out.println("Enter a money to retire");
                    money = sc.nextDouble();
                    money *= (-1);// Multiplico por -1 para tranformar el numero a negativo
                    account.setBalance(money);
                }
                case 3 -> {
                    System.out.println("Last 10 operations");
                    viewHistory(account.getClient());

                }
                case 4 -> System.out.println("Thanks, See U later");
            }

        } while (op >= 1 && op < 4);
    }

    public static void viewHistory(UserBank history) {
        int i = 0;
        if (history.getBankingHistory().size() > 10) {
            //Si hay mas de 10 operaciones
            i = history.getBankingHistory().size();
            i -= 10;
        }

        for (; i < history.getBankingHistory().size(); i++) {

            System.out.println(history.getBankingHistory().get(i));
        }
    }

}
