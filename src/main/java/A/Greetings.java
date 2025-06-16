package A;

import static B.Message.displayMessage;

public class Greetings {

    public static void greet(){
        System.out.println("Welcome to the family");
    }


    public static void main(String[] args) {

        greet();
        displayMessage();

    }
}
