public class Devices {
    
    private int battary; 

    public Devices(){
        this.battary = 100;

    }

    public int  getBattary(){
        
        return battary ;
    }

    public void setBattary(int battary){
        this.battary += battary;
        if (this.battary>100){
            this.battary = 100;
            System.out.println("The Battary is full!");

        }
        if(this.battary<100){
            System.out.println("Battary charging");
        }


    }

}

