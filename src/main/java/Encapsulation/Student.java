package Encapsulation;

public class Student {

    private String name;
    private int age;

    public Student(String name, int age) {

        this.name = name;
        this.age = age;

    }

    public String getName(){
        return this.name;
    }

    public String setName(String newname){
        return this.name = newname;
    }
    public int getAge(){
        return this.age;
    }

    public int setAge(int newage){
        return this.age = newage;
    }



}
