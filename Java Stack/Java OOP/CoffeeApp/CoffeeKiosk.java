import java.util.ArrayList;

public class CoffeeKiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    public CoffeeKiosk() {
        menu = new ArrayList<>();
        orders = new ArrayList<>();
    }

    public void addMenuItem( String name, double price ) {
        Item item = new Item(name, price, menu.size());
        menu.add(item);
        }
    
    public void displayMenu(){
        for (Item item : menu) {
            System.out.printf("%d %s -- $%.2f \n", item.getIndex(),item.getName(),item.getPrice());
        }
    }

    public void newOrder() {
        
        // Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
        // Your code:
        // Create a new order with the given input string
        Order customer = new Order(name);
        // Show the user the menu, so they can choose items to add.
        displayMenu();
        // Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        
        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
            try {
                int index = Integer.parseInt(itemNumber);
                if (index >= 0 && index < menu.size()) {
                    customer.addItem(menu.get(index));
                } else {
                    System.out.println("Invalid index. Please enter a valid menu index.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }

            // Get the item object from the menu, and add the item to the order
            // Ask them to enter a new item index or q again, and take their input
        }
        orders.add(customer);
        // After you have collected their order, print the order details 
        customer.getOrderTotal();
        customer.display();
    }

}