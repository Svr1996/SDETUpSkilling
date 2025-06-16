package MethodsInJava;

import java.sql.SQLOutput;

public class PassByValueExample {
    public static void main(String[] args) {
        //Example 1
//        String name = "Sandeep";
//        greet(name); //it will print Sandeep

        //Example 2
        String name1 ="Sandeep";
        changeName(name1);
        System.out.println(name1); //it will print Sandeep

    }

    private static void greet(String naam) {
        System.out.println(naam);

    }
    public static void changeName(String naam){
        naam = "Rupesh"; // this is not changing the value, creating a new object

    }

}
