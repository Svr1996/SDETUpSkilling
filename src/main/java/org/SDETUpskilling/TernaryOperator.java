package org.SDETUpskilling;

public class TernaryOperator {

    public static void main(String[] args) {

        String textIfTrue = "Get started";
        String textIfFalse = "you are in.. start exploring";

        boolean isNewUser = false;

        // Choose text dynamically based on condition
        String visibleText = isNewUser ? textIfTrue : textIfFalse;

        // Dynamically create XPath using String.format()
        System.out.printf("Generated XPath: //div[text()='%s']", visibleText);
        // OR
        String dynamicXPath = String.format("//div[text()='%s']", visibleText);

        // Print the final XPath (In real Selenium, you'd pass this to driver.findElement)
        System.out.println("\nGenerated XPath: " + dynamicXPath);


//        String s1 = "Get started";
//        String s2 = "you are in.. start exploring";
//        boolean check = false;
//
//        if(check==true){
//            System.out.println(String.format("//div[text()='%s']",s1));
//        }else{
//            System.out.println(String.format("//div[text()='%s']",s2));
//        }

    }
}
