package FactoryDesignPattern;

public abstract class NotificationCreator {

    // abstract because we want to force subclasses to implement this method
    public abstract Notification createNotification();

    // common method
    public void sendNotification(String message) {
        Notification notification = createNotification();
        notification.send(message);
    }
}
