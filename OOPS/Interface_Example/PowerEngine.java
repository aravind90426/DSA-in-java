package OOPS.Interface_Example;

public class PowerEngine implements  Engine{
    @Override
    public void start() {
        System.out.println("Power Enine Start");
    }

    @Override
    public void stop() {
        System.out.println("power Engine Stop");
    }

    @Override
    public void acc() {
        System.out.println("Power Enine acc");
    }
}
