package InterfacewithDefaultmethods;

public class MyClass implements A, B{

    // Only ONE method needs to be implemented!
    //Even though both interfaces have a method called show(), your class only needs to implement it once.
    @Override
    public void show() {
        System.out.println("Show method from both A and B handled here");
    }

    // ❌ Now there's a conflict! Must override fun() to resolve it
    //Think of two teachers (interfaces) giving the same homework question.
    //You only need to answer it once (implement the method) — not twice.
    //But if both teachers give their own answers (default method), now you have to choose or give your own answer (override in class).
    @Override
    public void fun() {
        System.out.println("Overridden show() in MyClass");

        //Inside that override, you can use A.super.fun() to call the specific version from interface A
       // A.super.fun();
    }




    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.fun();

    }
}
