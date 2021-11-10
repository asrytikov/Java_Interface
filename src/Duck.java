public class Duck implements Swimmable{

    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.swim();
        Chicken chicken = new Chicken();
        chicken.swim();
        chicken.fly();
    }

    @Override
    public void swim() {
        System.out.println("Swiming duck");
    }
}
