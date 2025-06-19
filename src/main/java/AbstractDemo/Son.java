package AbstractDemo;

public class Son extends Parent {


    public Son(String name, int age) {
        super(name, age);
    }

    @Override
    void career(){
        System.out.println("I want to be a doctor");
    }

    @Override
    void myName(){
        System.out.println("My name is Sandy");

    }



}
