package StringManipulations;

import javax.xml.transform.Source;

public class ConCat {

    public static void main(String[] args) {

        String x= "abc";
        String y = "abc";
        int a = 100;
        int b= 200;
        x.concat(y);

        System.out.println(x);//this will still print abc
        System.out.println(x+y); //this print abcabc
        System.out.println(a+b); //this prints 300
        System.out.println(x+y+a+b);//this prints abcabc100200
        System.out.println(a+b+x+y); //this prints 300abcabc


    }
}
