package StrategyDesignPattern;

public class NotificationContext {
    private NotificationSender notificationSender;

    public NotificationContext(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    public void setNotificationSender(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    public void send(String message) {
        notificationSender.sendNotification(message);
    }

}
