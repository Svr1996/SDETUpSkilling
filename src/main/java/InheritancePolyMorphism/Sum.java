package InheritancePolyMorphism;

public class Sum {

    int sum(int a, int b){
        return a+b;
    }

    double sum(double a, int b){
        return a+b;
    }

    double sum(double a, int b, double c){
        return a+b+c;
    }

    public static void main(String[] args) {

        Sum add = new Sum();
        System.out.println(add.sum(25,5,2));
        System.out.println(add.sum(2,5));

    }
}
