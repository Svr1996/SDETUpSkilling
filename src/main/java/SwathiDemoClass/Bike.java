package SwathiDemoClass;

public class Bike {

    String color = "Black";
    float price;
    int model;
    String engineType;

    //this will add values to the above properties object by object
    // we need one word to access every object properties

    Bike(String color, int model,String engineType){
        this.color = color;
        this.model = model;
        this.engineType = engineType;
    }

    public static void main(String[] args) {

        Bike ns = new Bike("Red",2025,"Petrol");
        System.out.println("color of the NS bike is " +ns.color);

        Bike ola = new Bike("Blue", 2020, "Electric");
        System.out.println("color of the ola bike is " +ola.color);

    }


}
