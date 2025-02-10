package OOPS.Interface_Example;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("electric start");
    }

    @Override
    public void stop() {
        System.out.println("Electric stop");
    }

    @Override
    public void acc() {
        System.out.println("electric acc");
    }
}
