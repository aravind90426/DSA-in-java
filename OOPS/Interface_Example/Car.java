package OOPS.Interface_Example;



public class Car implements  Engine,Music,Brake{

    @Override
    public void brake() {
        System.out.println("stop Car");
    }

    @Override
    public void start() {
        System.out.println(" start engine");
    }

    @Override
    public void stop() {
        System.out.println("stop engine");
    }

    @Override
    public void acc() {
        System.out.println("acc engine");
    }
}
