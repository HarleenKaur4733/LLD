package ObserverDesignPattern;

public class AnalyticsNotificationService implements NotificationServices {

    @Override
    public void update(Order order) {
        System.out.println("Analytics updated for order " + order.getStatus());
    }

}
