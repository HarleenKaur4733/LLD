package CodingExercises.EcommerceProductPriceAlert;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {
    String productName;
    double productPrice;
    List<Observer> observers;

    public Product(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.observers = new ArrayList<>();
    }

    @Override
    public void subscribeObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(productPrice);
        }
    }

    public void setProductPrice(double productPrice) {
        if (this.productPrice != productPrice) {
            this.productPrice = productPrice;
            notifyObservers();
        }
    }

}