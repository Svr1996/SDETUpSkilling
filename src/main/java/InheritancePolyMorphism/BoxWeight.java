package InheritancePolyMorphism;

public class BoxWeight extends Box{

    double weight;

    public BoxWeight() {
        this.weight = -1;

        // can't access because it is private
        //this.num;
    }

    public BoxWeight(double length, double width, double height, double weight) {
        // super is used to call the base class constructor and initialize the values in parent class
        super(length, width, height);
        this.weight = weight;
    }

    //Static methods cannot be Overriden

    static void greetings(){
        System.out.println("I'm in Boxweight");
    }

}
