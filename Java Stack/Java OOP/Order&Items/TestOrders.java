import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item Item1= new Item();
        Item1.name= "mocha";
        Item1.price= 5;
        Item Item2= new Item();
        Item2.name= "Latte";
        Item2.price= 7;
        Item Item3= new Item();
        Item3.name= "drip coffee";
        Item3.price= 10;
        Item Item4= new Item();
        Item4.name= "cappuccino";
        Item4.price= 15;
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        order1.name = "Rami"; 
        Order order2 = new Order();
        order2.name = "Jimmy"; 
        Order order3 = new Order();
        order3.name = "Noah"; 
        Order order4 = new Order();
        order4.name = "Sam"; 

        // Application Simulations
        order2.items.add(Item1);
        order2.total += Item1.price;
        order2.ready  = true;

        order3.items.add(Item4);
        order3.total += Item4.price;
        order3.ready  = true;


        order4.items.add(Item4);
        order4.total += Item4.price + Item2.price + Item2.price;
        order4.ready = true;

        order1.ready = true;
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);
        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);
        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);

    }
}