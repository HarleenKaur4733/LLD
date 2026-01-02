
import StrategyDesignPattern.EmailNotifications;
import StrategyDesignPattern.NotificationContext;
import StrategyDesignPattern.NotificationSender;
import StrategyDesignPattern.WhatsappNotifications;

public class App {
    public static void main(String[] args) throws Exception {

        // -------------------- without context -----------------------------------
        // System.out.println("Hello, World!");
        // NotificationSender emailSender = new EmailNotifications();

        // emailSender.sendNotification("This is a test email notification.");

        // NotificationSender whatsappSender = new WhatsappNotifications();

        // whatsappSender.sendNotification("This is a test whatsapp notification.");
        // ----------------------------------------------------------------------------
        // Context is made so that main doesnt get dirty, and avoid
        // revealing any internal implmentation
        NotificationSender emailSender = new EmailNotifications();
        NotificationContext notificationContextEmail = new NotificationContext(emailSender);
        notificationContextEmail.send("Email!!");

        notificationContextEmail.setNotificationSender(new WhatsappNotifications());
        notificationContextEmail.send("Whatsapp!!");

    }
}
