package AbstractDemo;

public class Daughter extends Parent {


    public Daughter(String name, int age) {
        super(name, age);
    }

    @Override
    void career(){
        System.out.println("I want to be a coder");
    }

    @Override
    void myName(){
        System.out.println("My name is Swathi");

    }


}
