package ObserverDesignPattern;

public class EmailNotificationService implements NotificationServices {

    @Override
    public void update(Order order) {
        System.out.println("Email sent for order " + order.getStatus());
    }

}
