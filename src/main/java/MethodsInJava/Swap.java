package MethodsInJava;

public class Swap {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        swap(a, b);
        System.out.println("Swap of two numbers " +a+ " " +b );

    }

    public static void swap(int a, int b){
        int temp = a;
        a=b;
        b=temp;

    }
}
