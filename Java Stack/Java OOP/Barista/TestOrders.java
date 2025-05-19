public class TestOrders {
    public static void main(String[] args) {
        // Creating items
        Item coffee = new Item("Drip Coffee", 1.50);
        Item cappuccino = new Item("Cappuccino", 3.50);
        Item latte = new Item("Latte", 4.00);
        Item espresso = new Item("Espresso", 2.50);

        // Creating orders
        Order order1 = new Order();  
        Order order2 = new Order();  
        Order order3 = new Order("Mahmoud");
        Order order4 = new Order("Ahmad");
        Order order5 = new Order("Mohammed");

        // Adding items to orders
        order1.addItem(coffee);
        order1.addItem(cappuccino);

        order2.addItem(latte);
        order2.addItem(espresso);

        order3.addItem(espresso);
        order3.addItem(coffee);

        order4.addItem(cappuccino);
        order4.addItem(latte);

        order5.addItem(espresso);
        order5.addItem(cappuccino);

        // Setting readiness status
        order1.setReady(true);
        order3.setReady(true);

        // Display order statuses
        System.out.println(order1.getStatusMessage());
        System.out.println(order2.getStatusMessage());
        System.out.println(order3.getStatusMessage());

        // Display order totals
        System.out.println("Order 1 total: $" + order1.getOrderTotal());
        System.out.println("Order 3 total: $" + order3.getOrderTotal());

        // Display all orders
        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();
    }
}