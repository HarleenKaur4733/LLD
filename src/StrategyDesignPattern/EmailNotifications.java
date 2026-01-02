package StrategyDesignPattern;

public class EmailNotifications implements NotificationSender {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Email Notification: " + message);
    }

}
