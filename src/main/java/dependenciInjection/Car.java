package dependenciInjection;
//Here we have a class Car that has a dependency, an engine.We can instantiate a new engine object here
//or we can maintain flexibility by requiring to pass the dependency to the constructor.
//In other word, when we create a car object, we need to inject the dependency into the arguments
//of the constructor.
//This also works with static factories or builders.
public class Car {
    private Engine engine;

    public Car(Engine engine){
        this.engine=engine;
    }

    public double accelerateCoeficient(){
        return engine.getPower()*0.1;
    }

}
