package interfaces;

public class Main {

    public static void main(String[] args) {

        Audi myAudi = new Audi();
        //Cannot assign a value to final variable 'price'
        //myAudi.price = 20000;

        myAudi.start();
        myAudi.stop();
        myAudi.startMusic();
        myAudi.stopMusic();
        myAudi.showRoute();


        //Static method may only be called on its containing interface
        myAudi.brake();

        //'Car' is abstract; cannot be instantiated
        //Car audi = new Car();

        // we can call static methods without creating an object
        //Because static methods belong to the interface itself, not to the objects or classes that implement the interface.
        Car.serviceReminder();

        Car audi = new Audi();
        //Static method may only be called on its containing interface : audi.serviceReminder();

        Car.serviceReminder();
        MusicSystem.adjustVolume();
        GPS.setTheDestination();





    }

}
