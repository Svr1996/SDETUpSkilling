package MethodsInJava;

public class Greetings {

    public static void main(String[] args) {
        String message = greet();
        System.out.println(message);
    }

    static String greet(){
        String greetings = "How are you";
        return greetings;
    }

}
