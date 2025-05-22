
import java.util.ArrayList;

public class Order {
    private String name;
    private double total;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();

    public Order() {
        name = "Guest";
        ready = false;
    }

    public Order(String name) {
        this.name = name;
        ready = false;
        items = new ArrayList<Item>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public String getStatusMessage() {
        if (ready) {
            return "Your order is ready!";
        } else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double getOrderTotal() {
        for (Item item : items) {
            if (item != null) {
                total+=item.getPrice();
            } else {
                System.out.println("(Invalid order)");
            }
        }
        return total;
    }

    public void display() {
        System.out.println("Customer Name: " + name);
        for (Item item : items) {
            if (item != null) {
                System.out.printf(" %s - $%.2f\n", item.getName(), item.getPrice());
            } else {
                System.out.println("(Invalid order)");
            }
        }
        System.out.printf("Total: $%.2f\n", total);
    }

}