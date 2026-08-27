package FactoryDesignPattern;

public class App {
    public static void main(String[] args) throws Exception {
        // NotificationFactory notificationFactory = new NotificationFactory();

        // Notification emailNotification =
        // notificationFactory.createNotification("EMAIL");
        // emailNotification.send("This is an email notification.");

        // Notification smsNotification = notificationFactory.createNotification("SMS");
        // smsNotification.send("This is an SMS notification.");

        // Notification emailNotification = new EmailNotification();
        // emailNotification.send("This is an email notification.");

        // Notification smsNotification = new SMSNotification();
        // smsNotification.send("This is an SMS notification.");

        NotificationCreator emailNotificationCreator = new EmailNotificationCreator();
        emailNotificationCreator.sendNotification("This is an email notification.");
    }
}
