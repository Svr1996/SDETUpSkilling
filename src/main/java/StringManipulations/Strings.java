package StringManipulations;

public class Strings {

    public static void main(String[] args) {

        String str = "Sandeep";
        String str1 = "Sandeep";
        String str2 = "Sandeep";
        String str3 = str;

        // == always compare if reference variables are pointing to the same object (Reference (memory address)) and not the object value
//        System.out.println(str == str3);
//        str1 = "Rupesh"; // this will create a new object in the string pool
//        System.out.println(str == str1);

        String a = new String("Sandy");
        String b = new String("Sandy");
        String c = a;

        System.out.println(a==b);//false
        System.out.println(b==a); //false
        System.out.println(a.equals(b)); //true
        System.out.println(c==a); //true



    }
}
