import CodingExercises.EcommerceProductPriceAlert.Product;
import CodingExercises.EcommerceProductPriceAlert.User;

public class App {
    public static void main(String[] args) {
        Product product = new Product("Iphone 14", 999.99);
        product.subscribeObserver(new User("Alice"));
        product.subscribeObserver(new User("Bob"));
        product.setProductPrice(899.99);

        product.unsubscribeObserver(new User("Alice"));
        product.setProductPrice(799.99);
    }
}
