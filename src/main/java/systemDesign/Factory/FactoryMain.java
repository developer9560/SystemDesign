package systemDesign.Factory;

public class FactoryMain {

    public static void main(String[] args) {

        NotificationCreator emailCreator = new EmailNotificationCreator();
        emailCreator.notifyUser("Your Order has shipped");

        NotificationCreator smsCreator = new SMSNotificationCreator();
        smsCreator.notifyUser("you OTP is 1234");

        NotificationCreator whatsapp = new WhatsappNotificationCreator();
        whatsapp.notifyUser("you order is ready!");
    }
}
