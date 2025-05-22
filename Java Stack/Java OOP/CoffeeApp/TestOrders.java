public class TestOrders {
    public static void main(String[] args) {
        CoffeeKiosk kiosk = new CoffeeKiosk();
       
        kiosk.addMenuItem( "banana", 2 );
        kiosk.addMenuItem( "coffee", 1.5 );
        kiosk.addMenuItem( "latte", 4.5 );
        kiosk.addMenuItem( "capuccino ", 3 );
        kiosk.addMenuItem( "muffin", 4 );
        kiosk.newOrder();
    }
}


     