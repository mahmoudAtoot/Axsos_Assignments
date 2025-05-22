
public class Bat extends Mammal {

    public Bat(){

        setEnergyLevel (300);
    }
    
    public void fly(){
        setEnergy(-50);

        System.out.println("The Bat is now airborne.");

    }

    public void eatHumans(){
        setEnergy(25);
        
        System.out.println("The Bat has eat a humen.");

    }

    public void attackTown(){
        setEnergy(-100);
        
        System.out.println("The Bat is attacking home.");
    }
}
