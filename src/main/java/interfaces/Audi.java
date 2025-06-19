package interfaces;

import AbstractDemo.Son;

import java.sql.SQLOutput;

public class Audi implements Car, MusicSystem,GPS{

    @Override
    public void start() {
        System.out.println("Start the Engine of Audi Car");
    }

    @Override
    public void stop() {
        System.out.println("Stop the Engine of Audi Car");
    }

    @Override
    public void showRoute() {
        System.out.println("Show the route to Audi Car");
    }


    @Override
    public void startMusic() {
        System.out.println("start the music in Audi Car");
    }

    @Override
    public void stopMusic() {
        System.out.println("stop the music in Audi Car");
    }

    //This are class methods since it is not declared in interfaces
    public static void brake(){
        System.out.println("Audi car has ABS brake");
    }
}
