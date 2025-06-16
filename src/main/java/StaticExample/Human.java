package StaticExample;

public class Human {

    String name;
    int age;
    long salary;
    static long population;

  Human(){

  }

    public Human(String name, int age, long salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        Human.population += 1;
    }

    //this method is not dependant on object
    static void message(){
        //static method can only access static data
        //Inside static method, we can't use anything which is non-static
        population = 2;
//        name ="Sandeep";
//        greeting();

        // You can't access non-static stuff without referencing their instances in a static context
        // Hence here , I'm referencing it
        Human obj = new Human();
        obj.greeting();

//        we can't use this keyword in static method
//        System.out.println(this.age);

    }

    //this method is  dependant on object
    void greeting(){
        //
        message();

        System.out.println("Hello");
    }

    public static void main(String[] args) {

//        Human sandy = new Human("Sandeep",28,10000);
//        Human swathi = new Human("SwathiMuniraju",22,20000);

        population = 10;

        System.out.println(Human.population);



    }
}
