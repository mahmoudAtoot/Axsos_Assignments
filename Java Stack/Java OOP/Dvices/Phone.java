public class Phone extends Devices {
    


    public void makeCall(){
        setBattary(-5);


    }

    public void playGame(){
        if(getBattary() < 25){
            System.out.println("The Battary is low!");
        }else{
            setBattary(-20);
        }
    }

    
    public void charge(){
        setBattary(-50);

    }

    
}
