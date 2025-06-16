package ClassDemo;

public class FinalVar {
    String name;

    static final long salary = 10000;

    static final String str1 = "Sandeep";
    static final String str2 = "Swathi";

    static final String str3 = new String("Sandeep");

    static final String str4 = new String("Swathi");

    public static void main(String[] args) {
        // this will throw an error, because it is final and primitive data type

        //salary = 20000;
        // the below will throw an error because it will not create an object
//          str1 = "SandeepaMuniraju";
//          str2 = "SwathiMuniraju";

//        str3 = "SandeepMuniraju";
//        str4 = "SwathiMuniraju";

        final FinalVar std1 = new FinalVar();

        std1.name = "Sandeep";
        System.out.println(std1.name);
        std1.name = "Rupesh";
        System.out.println(std1.name);

        final FinalVar std2 = new FinalVar();



    }

}
