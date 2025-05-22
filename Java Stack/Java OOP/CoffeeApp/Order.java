
import java.util.ArrayList;

public class Order {

    private String name;
    private double total;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();

    public Order() {
        this.name = "Guest";
        this.ready = false;
    }

    public Order(String name) {
        this.name = name;
        this.ready = false;
        this.items = new ArrayList<Item>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isReady() {
        return this.ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public String getStatusMessage() {
        if (this.ready) {
            return "Your order is ready!";
        } else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double getOrderTotal() {
        for (Item item : this.items) {
            System.out.println(item.getPrice());
            if (item != null) {
                // this.total+=item.getPrice();
            } else {
                System.out.println("(Invalid order)");
            }
        }
        return this.total;
    }

    public void display() {
        System.out.println("Customer Name: " + this.name);
        for (Item item : this.items) {
            if (item != null) {
                System.out.println( item.getName() + "-----"+ item.getPrice());
            } else {
                System.out.println("(Invalid order)");
            }
        }
        System.out.println( this.total);
    }

}
