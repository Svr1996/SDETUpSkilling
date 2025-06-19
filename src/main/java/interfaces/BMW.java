package interfaces;

public class BMW implements Car, MusicSystem, GPS{
    @Override
    public void start() {
        System.out.println("Start the Engine of BMW Car");
    }

    @Override
    public void stop() {
        System.out.println("Stop the Engine of BMW Car");
    }

    @Override
    public void showRoute() {
        System.out.println("Show the route to BMW Car");
    }

    @Override
    public void startMusic() {
        System.out.println("start the music in BMW Car");
    }

    @Override
    public void stopMusic() {
        System.out.println("stop the music in BMW Car");
    }
}
