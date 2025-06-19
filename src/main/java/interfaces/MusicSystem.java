package interfaces;

public interface MusicSystem {


    void startMusic();
    void stopMusic();



    //Can we write the static methods in interfaces: Yes

    static void adjustVolume() {
        System.out.println("Bass level adjusted.");
    }

//    static void startMusicPlayer(){
//        System.out.println("start the music player");
//    }
//
//    static void stopMusicPlayer(){
//        System.out.println("stop the music player");
//    }

    // can we write main method inside the interfaces: yes
//    public static void main(String[] args) {
//
//        System.out.println("This is main method");
//
//    }
}
