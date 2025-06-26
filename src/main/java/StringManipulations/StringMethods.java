package StringManipulations;

import javax.xml.transform.Source;
import java.sql.SQLOutput;

public class StringMethods {


    public static void main(String[] args) {

        String str1 = "The rains have started here";
        String str2 = "The rains have started here";

        //length() returns the size/ length of a string including white spaces
        System.out.println("Print the length of a string " +str1.length());

        //Print the index of first occurrence of 's'
        System.out.println("Print the index of first 's' "+ str1.indexOf('s'));

        //Print the index of second occurrence of  's'
        System.out.println("Print the index of second 's' in a string "+ str1.indexOf('s', str1.indexOf('s')+1));

        //Print the index of third occurrence of 's' please refer to occurrence of Strings

        //Print the value of a string with index
        System.out.println("Print the value of a string using index "+str1.charAt(5));

        System.out.println("Compare the values of two strings  " +str1.equals(str2));
        System.out.println("Compare the values of two strings  " +str1.equalsIgnoreCase(str2));

        //trim white spaces before and after
        String s3 = "    Hello World   ";
        System.out.println("Trim white before and after a String " +s3.trim());

        //Trim white spaces b/w strings
        System.out.println(s3.replace(" ",""));

        //Concat two strings
        String s4 = "Sandeep";
        System.out.println(s4.concat("Muniraju"));

        //Split a string
        String s5 = "Hello_World_Selenium";
        String[] val = s5.split("_");
        System.out.println(val[1]);

        






    }
}
