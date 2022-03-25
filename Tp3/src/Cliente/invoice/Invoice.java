package Cliente.invoice;

import Cliente.Client;

import java.util.ArrayList;
import java.util.Date;//Retorna dia y hora actual
import java.util.Arrays;
import java.util.UUID;

import Cliente.invoice.Item.Item;

public class Invoice {
    private UUID invoiceID;
    private final Date date = new Date();//Asigna hora actual y facha del computador
    private Client client;//Obtengo datos como el desuento
    private ArrayList<Item>items = new ArrayList<Item>();///Los varios items los voy a tener en la factura
    //No se cuantos productos va a comprar un cliente

    public Invoice() {
    }


    public Invoice(Client client) {
        this.invoiceID = UUID.randomUUID();
        this.client = client;

    }

    public UUID getInvoiceID() {
        return invoiceID;
    }

    public Date getDate() {
        return date;
    }

    public Client getClient() {
        return client;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(Item product) {
        items.add(product);
    }

    public double getMontoTotal() {
        int totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getItemPrice();

        }
        if (client.getDcto() > 0) {
            totalPrice -= ((totalPrice * client.getDcto()) / 100);

        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceID =" + invoiceID +
                ", totalPrice =" + getMontoTotal() +
                ", date =" + date + "\n" +
                "items =" + items.toString() +
        ",.  ";
    }
}
