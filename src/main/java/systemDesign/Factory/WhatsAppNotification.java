package systemDesign.Factory;

public class WhatsAppNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("sending Whatsapp : "+ message);
    }
}
