package ObserverDesignPattern;

public class App2 {
    public static void main(String[] args) throws Exception {
        Order order = new OrderImpl();
        NotificationServices emailNotificationServices = new EmailNotificationService();
        NotificationServices smsNotificationServices = new SMSNotificationService();
        NotificationServices analyticsNotificationServices = new AnalyticsNotificationService();

        order.subscribe(analyticsNotificationServices);
        order.subscribe(emailNotificationServices);
        order.subscribe(smsNotificationServices);

        order.setStatus(OrderStatus.DELIVERED);

        // Unsubscribing analytics
        order.unsubscribe(analyticsNotificationServices);
        order.setStatus(OrderStatus.SHIPPED);

    }
}
