public class Viber implements Messenger{

    @Override
    public void sendMessage() {
        System.out.println("Send from Viber");
    }

    @Override
    public void getMessage() {
        System.out.println("Get message from Viber");
    }
}
