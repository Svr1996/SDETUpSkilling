package MethodsInJava;

public class BlockScoping {

    public static void main(String[] args) {

        int a =10;
        int b=20;
        System.out.println(""+a);
        {
           // int a=30; already initialized outside the block in the same method, hence can't be initialized again
            a=30; // but we can change the value of it.
            //values initialized in this block, will remain in block
            System.out.println(""+a);

        }

        for (int i=0;i<10;i++){
            i=20;

        }
       // System.out.println(i);

        //can't use outside the block
        //System.out.println(""+c);
    }
}
