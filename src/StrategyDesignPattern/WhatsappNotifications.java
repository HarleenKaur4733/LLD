package StrategyDesignPattern;

public class WhatsappNotifications implements NotificationSender {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Whatsapp Notification: " + message);
    }

}
