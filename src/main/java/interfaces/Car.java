package interfaces;

public interface Car {

    int price = 1000;

    String EngineType = "Only Petrol Engine";

    // we can't just declare variables here because by default these are public static final
    //Field 'price' might not have been initialized
    //int price;
    //Modifier 'private' not allowed here
    //private int price = 10000;

    //Interface abstract methods cannot have a body
//    void start(){
//
//    }

    //Private methods in interfaces should have a body but it doesn't make sense to write a
    // private method since it can't inherited
//    private void accelerate(){
//        System.out.println("accelerate the car");
//    }

    //Constructor is not allowed in interface, since we can't create an object of an interface having a
    // constructor doesn't make sense
//    public Car(){
//
//    }

    void start();
    void stop();

    //Can we write the static methods in interfaces: yes from Java 8
    static void serviceReminder() {
        System.out.println("Time for your car service!");
    }



}
