package OOP.Abstraction;

public class Moto extends Vechil{

    @Override
    public void moveForward() {
        System.out.println("Press 1 and Move");
    }

    @Override
    public void moveBackward() {
        System.out.println("Random");
    }
}
