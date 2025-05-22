
import java.util.ArrayList;

public class Order {
    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items; // defaults to null

    // CONSTRUCTOR - No arguments, sets name to "Guest", initializes items as an empty list.
    public Order() {
        this.name = "Guest";
        this.items = new ArrayList<>();
    }

    // OVERLOADED CONSTRUCTOR 
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    // ADD ITEM METHOD
    public void addItem(Item item) {
        items.add(item);
    }
    
    // GET STATUS MESSAGE METHOD
    public String getStatusMessage() {
        return ready ? "Your order is ready." : "Thank you for waiting. Your order will be ready soon.";
    }

    // GET ORDER TOTAL METHOD
    public double getOrderTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    // DISPLAY METHOD
    public void display() {
        System.out.println("Customer Name: " + name);
        for (Item item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("Total: $" + getOrderTotal());
    }

    // GETTERS & SETTERS
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
}