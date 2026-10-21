package systemDesign.Factory;

public class SMSNotificationCreator extends NotificationCreator{

    @Override
    protected Notification createNotification() {
        return new SMSNotification();
    }
}
