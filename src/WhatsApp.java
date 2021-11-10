public class WhatsApp implements Messenger{

    @Override
    public void sendMessage() {
        System.out.println("Send from WhatsApp");
    }

    @Override
    public void getMessage() {
        System.out.println("Get message from WhatsApp");
    }
}
