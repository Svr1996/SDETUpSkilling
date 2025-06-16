package ClassDemo;

public class StringDemo {

    // What is the use of toString Method and PSVM(String args[])
    String name;

    StringDemo(String name){
        this.name = name;

    }

    public static void main(String[] args) {

        StringDemo str = new StringDemo("Sandeep");

        System.out.println(str);// this will print the hashcode

    }



}
