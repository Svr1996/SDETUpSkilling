package MethodsInJava;

public class Shadowing {

    static int x =10;

   static void show(){
        int x=20;
       System.out.println(""+x);
    }

    static void fun(){
        System.out.println(""+x);
    }

    public static void main(String[] args) {

        show();
        fun();


    }
}
