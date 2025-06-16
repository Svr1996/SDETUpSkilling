package MethodsInJava;

public class StringExample {

    public static void main(String[] args) {

        String personalized = myGreet("Sandeep");
        System.out.println(personalized);


    }

    public static String myGreet(String name){
        return "Hello " +name;

    }



}
