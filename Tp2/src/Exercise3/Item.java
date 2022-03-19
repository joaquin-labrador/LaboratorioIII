package Exercise3;

import org.w3c.dom.ls.LSOutput;

public class Item {
    private int ID;
    private String description;
    private int stock;
    private double price;

    public Item() {
    }

    public Item(int ID, String description, int stock, double price) {
        this.ID = ID;
        this.description = description;
        this.stock = stock;
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double totalValue(double P, int C) {
        return (C > 0) ? P * C : 0;
    }
    public boolean verificationS() {
        return (getStock() != 0);
    }
    @Override
    public String toString() {

        return "Item{" +
                "ID= " + ID +
                ", description= " + description + '\'' +
                ", stock= " + stock +
                ", price= " + price + "$" +
                (verificationS() ? " Total Value " + totalValue(getPrice(),getStock()) + "$" : " No stock") +
                '}';
    }
}


