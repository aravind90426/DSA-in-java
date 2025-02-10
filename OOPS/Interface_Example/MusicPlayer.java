package OOPS.Interface_Example;

public class MusicPlayer implements Music {

    @Override
    public void start() {
        System.out.println("Music Strat");
    }

    @Override
    public void stop() {
        System.out.println("Music stop");
    }
}
