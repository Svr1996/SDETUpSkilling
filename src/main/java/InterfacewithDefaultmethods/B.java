package InterfacewithDefaultmethods;

public interface B {

    void show();

    default void fun(){
        System.out.println("This is B interface");
    }
}
