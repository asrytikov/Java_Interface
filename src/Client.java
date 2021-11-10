public class Client {

 /*   private Telegram telegram;
    private WhatsApp whatsApp;
    private Viber viber;
    */

    private Messenger messenger;

    public Client(){
        this.messenger = new Telegram();
    }
}
