

public class Test {
    public static void main(String[] args) {

        Bat bat = new Bat();
        Gorilla gorilla = new Gorilla();

        System.out.println(bat.displayEnergy());
        bat.fly();
        System.out.println(bat.displayEnergy());
        bat.attackTown();
        System.out.println(bat.displayEnergy());
        bat.eatHumans();
        System.out.println(bat.displayEnergy());


        System.out.println("**************************************************");

        System.out.println(gorilla.displayEnergy());
        gorilla.throwSomething();
        System.out.println(gorilla.displayEnergy());
        gorilla.eatBananas();
        System.out.println(gorilla.displayEnergy());
        gorilla.climb();
        System.out.println(gorilla.displayEnergy());
        
    }
}