package Cliente.invoice.Item;

import java.util.UUID;

public class Item {
    private UUID id;
    private double itemPrice;
    private String nameItem;

    public Item() {
    }


    public Item(double itemPrice, String nameItem) {
        this.id = UUID.randomUUID();
        this.itemPrice = itemPrice;
        this.nameItem = nameItem;
    }


    public UUID getId() {
        return id;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public String getNameItem() {
        return nameItem;
    }


    @Override
    public String toString() {
        return " item{" +
                "id= " + id +
                ", itemPrice = " + itemPrice +
                ", nameItem = '" + nameItem + '\'' +
                 '}';
    }
}
