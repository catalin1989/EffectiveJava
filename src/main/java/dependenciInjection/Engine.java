package dependenciInjection;
//Dependency injection patters is very simple, we use it a lot without knowing how it is named.
public class Engine {

    private int power;
    public Engine(int power){
        this.power=power;
    }

    public int getPower() {
        return power;
    }
}
