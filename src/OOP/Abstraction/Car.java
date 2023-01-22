package OOP.Abstraction;

public class Car extends Vechil{
    @Override
    public void moveForward() {
        System.out.println("Press N and Move");
    }

    @Override
    public void moveBackward() {
        System.out.println("Press R and move");
    }
}
