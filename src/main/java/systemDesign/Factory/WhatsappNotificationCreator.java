package systemDesign.Factory;

public class WhatsappNotificationCreator extends NotificationCreator{
    @Override
    protected Notification createNotification() {
        return new WhatsAppNotification();
    }
}
