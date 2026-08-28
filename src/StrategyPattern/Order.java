package StrategyPattern;

public class Order {
    String destinationZone;
    int orderValue;

    public Order(String destinationZone, int orderValue) {
        this.destinationZone = destinationZone;
        this.orderValue = orderValue;
    }

    public String getDestinationZone() {
        return destinationZone;
    }

    public int getOrderValue() {
        return orderValue;
    }
}
