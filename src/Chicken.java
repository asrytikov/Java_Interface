public class Chicken implements Swimmable, Flyable{

    @Override
    public void swim() {
        System.out.println("Chicken not swim");
    }

    @Override
    public void fly() {
        System.out.println("Chicken not fly");
    }
}
