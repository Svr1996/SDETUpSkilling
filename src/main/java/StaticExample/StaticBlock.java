package StaticExample;

// this is a demo to show initialization of static variables
public class StaticBlock {
    static int a =10;
    static int b;

    // this will run only once when the first obj is created i,e when class is loaded for the first time
    static{
        System.out.println("I'm in a static block");
        b = a*2;

    }

    public static void main(String[] args) {

        StaticBlock obj1 = new StaticBlock();

        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);


    }




}
