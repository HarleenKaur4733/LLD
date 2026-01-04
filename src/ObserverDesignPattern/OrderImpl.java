package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class OrderImpl implements Order {

    List<NotificationServices> notificationServicesList = new ArrayList<>();
    OrderStatus status;

    @Override
    public void subscribe(NotificationServices notificationService) {
        if (!notificationServicesList.contains(notificationService)) {
            notificationServicesList.add(notificationService);
        }
    }

    @Override
    public void unsubscribe(NotificationServices notificationService) {
        notificationServicesList.remove(notificationService);
    }

    @Override
    public void notifyServices() {
        for (NotificationServices notificationService : notificationServicesList) {
            // call update to send notifications
            notificationService.update(this);
        }
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
        notifyServices();
    }

    public OrderStatus getStatus() {
        // TODO Auto-generated method stub
        return status;
    }

}
