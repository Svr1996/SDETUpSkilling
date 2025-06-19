package interfaces;

public interface GPS {

    void showRoute();

    //Static methods in interfaces should have a body
    //static void setTheDestination();

    static void setTheDestination(){
        System.out.println("Please provide destination");
    }

}
