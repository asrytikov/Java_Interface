public class Telegram implements Messenger, Application{

    @Override
    public void sendMessage() {
        System.out.println("Send from Telegram");
    }

    @Override
    public void getMessage() {
        System.out.println("Get message from Telegram");
    }

    @Override
    public void runApp() {
        System.out.println("Run Telegram");
    }
}
