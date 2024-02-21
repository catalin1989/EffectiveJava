package dependenciInjection;

public class Main {
    public static void main(String[] args) {
    Engine engine=new Engine(100);
    Engine engine1=new Engine(200);
    Car car=new Car(engine);
    Car car1=new Car(engine);
    Car car2=new Car(engine1);

        System.out.println(car.accelerateCoeficient());
        System.out.println(car1.accelerateCoeficient());
        System.out.println(car2.accelerateCoeficient());

    }
}
