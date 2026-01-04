package ObserverDesignPattern;

// Subject
public interface Order {

    public void subscribe(NotificationServices notificationService);

    public void unsubscribe(NotificationServices notificationService);

    public void notifyServices();

    public void setStatus(OrderStatus orderStatus);

    public OrderStatus getStatus();

}
