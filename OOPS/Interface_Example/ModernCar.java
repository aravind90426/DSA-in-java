package OOPS.Interface_Example;

public class ModernCar {
    Engine e;
    MusicPlayer m = new MusicPlayer();
    ModernCar()
    {
        e = new PowerEngine();
    }
    public void  startMusic(){
        m.start();
    }
    public void stopMusic(){
        m.stop();
    }
    public void start()
    {
        e.start();
    }
    public void stop()
    {
        e.stop();
    }
    public void acc()
    {
        e.acc();

    }
    public void updateElectricEngine(){
        e= new ElectricEngine();
    }
    public void updatePowerEngine(){
        e = new PowerEngine();
    }

}
