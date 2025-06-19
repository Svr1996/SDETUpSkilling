package NestedInterfaces;

public class B implements A.NestedInterface {
    @Override
    public Boolean isodd(int num) {
        return (num & 1) ==1;
    }

    public static void main(String[] args) {

        B obj = new B();
        System.out.println(obj.isodd(6));
        System.out.println(obj.isodd(5));
        System.out.println(obj.isodd(15));
    }
}
