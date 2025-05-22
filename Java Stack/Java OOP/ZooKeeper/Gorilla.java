public class Gorilla extends  Mammal {

    public void throwSomething(){

        setEnergy(-5);

        System.out.println("the gorilla has thrown an object.");
    }


    public void eatBananas(){

        setEnergy(10);

        System.out.println("The Gorilla has eat a banana.");

    }

    public void climb(){

        setEnergy(-10);

        System.out.println("the gorilla has climbed a tree.");

    }

}
