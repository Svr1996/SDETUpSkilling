package org.SDETUpskilling;

public class CommandLineExample {

    public static void main(String[] args) {
        System.out.println("Ran main method");
        int i = 0;
        for (String arg : args) {
            System.out.println("Arg " + i + ":" + arg);
            i++;
        }

    }

    public static void main() {
        System.out.println("Run another static method");
    }

}
