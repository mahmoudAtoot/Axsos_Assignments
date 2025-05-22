
public class Mammal {

    private int energyLevel;

    public Mammal(){
        energyLevel = 100;

    }

    public int displayEnergy(){
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel ){
        this.energyLevel = energyLevel;

    }

    public void setEnergy(int x){
        energyLevel += x;
        if (energyLevel > 100){
            energyLevel = 100;

        }
    }

    public void setBatEnergy(int x){
        energyLevel +=x;
        if (energyLevel > 100){
            energyLevel = 300;

        }


    }


}



