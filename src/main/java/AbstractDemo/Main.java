package AbstractDemo;

public class Main {

    public static void main(String[] args) {

        //can't create an object of Abstract class hence it can't be instantiated
        //Parent mom = new Parent();

        Son son = new Son("Sandeep", 25);
        son.career();
        son.myName();

        Daughter daughter = new Daughter("Swathi",22);
        daughter.career();
        daughter.myName();

        //we can create referance var of Student Class
        Parent obj = new Daughter("Swathi",21);
        obj.myName();


    }
}
