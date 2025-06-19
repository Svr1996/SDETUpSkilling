package AbstractDemo;

public abstract class Parent {

    //can create data members/ declare variables
    String name;
    int age;
    static String occupation;

   // Can have a constructor
    public Parent(String name, int age){
        this.name = name;
        this.age = age;
        Parent.occupation= "QA";
    }
    // can have normal methods with body and static methods too
    static void normal(){
        System.out.println("This is a normal static method");
    }

    //Abstract class must contain atleast one abstract method
    abstract void career();
    abstract void myName();


}
