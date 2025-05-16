package ListOfExceptions;
import java.util.ArrayList;


public class CastException {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");


        for (int i = 0; i < myList.size(); i++) {
                try {
                    Integer castedValue = (Integer) myList.get(i);
                    System.out.println("Successfully casted: " + castedValue);
                }catch (ClassCastException e) {
                    System.out.println("Error: Cannot cast value at index " + i);
                    System.out.println("Problem Value" + myList.get(i));
                    System.out.println("Exception message: " + e.getMessage());
                }


                
                
            }
            System.out.println("Program continues execution...");


    
    }
}
