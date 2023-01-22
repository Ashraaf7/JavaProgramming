package OOP.Abstraction;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Moto moto = new Moto();
        car.moveForward();
        car.moveBackward();
        moto.moveForward();
        moto.moveBackward();
    }
}
