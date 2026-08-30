package CodingExercises.EcommerceProductPriceAlert;

public interface Subject {
    void subscribeObserver(Observer observer);

    void unsubscribeObserver(Observer observer);

    void notifyObservers();
}
