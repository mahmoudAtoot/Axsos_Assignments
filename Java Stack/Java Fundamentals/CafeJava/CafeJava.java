public class CafeJava{
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double dripCoffee = 4;
        double dripLatte = 7;
        double dripCappuccino = 6;

        // Customer name variables (add yours below)
        String customer1 = "Ahmad";
        String customer2 = "Sali";
        String customer3 = "Adam";

    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;

    
        System.out.println(generalGreeting + customer2 + pendingMessage); 
        System.out.println(displayTotalMessage + dripCoffee);
        if (isReadyOrder1) {

            System.out.println(readyMessage + customer2);
            
        }else{

            System.out.println(pendingMessage + customer2);

        }

        System.out.println("***********************************");

        System.out.println(generalGreeting + customer1);
        System.out.println(displayTotalMessage + dripCappuccino);
        if (isReadyOrder2) {
           
            System.out.println(readyMessage + customer2);
        }else{

            System.out.println(pendingMessage + customer2);

        }
        System.out.println("***********************************");


        System.out.println(customer2 + ", you ordered 2 lattes.");
        System.out.println(displayTotalMessage + dripLatte*2);

        isReadyOrder2 = false;
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
        } else {
            System.out.println(customer2 + pendingMessage);
        }
        System.out.println("***********************************");
        

        System.out.println( customer3 + ", you were charged for coffee but ordered a latte.");
        System.out.println("we must to return for Adam: $" + (dripLatte - dripCoffee));



        // ** Your customer interaction print statements will go here ** //
    }
}