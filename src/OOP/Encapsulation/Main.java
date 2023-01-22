package OOP.Encapsulation;

public class Main {
    public static void main(String[] args) {
        //Can access private property via Getters and Setters
        Encapsulation e = new Encapsulation();
        e.setUser(123);
        e.setPass(11111);
        e.getUser();
        e.getPass();
    }
}
