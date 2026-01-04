package ObserverDesignPattern;

public class SMSNotificationService implements NotificationServices {

    @Override
    public void update(Order order) {
        System.out.println("SMS sent for order " + order.getStatus());
    }

}
