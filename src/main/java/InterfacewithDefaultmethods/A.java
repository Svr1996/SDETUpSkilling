package InterfacewithDefaultmethods;

public interface A {

    void show();

    default void fun() {
        System.out.println("This is A interface");
    }
}
