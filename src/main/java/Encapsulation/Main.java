package Encapsulation;

public class Main {

    public static void main(String[] args) {

        Student std = new Student("Sandeep", 28);
        System.out.println(std.getName());
        std.setName("SVR");
        System.out.println(std.getName());
    }

}
