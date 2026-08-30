package CodingExercises.EcommerceProductPriceAlert;

public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(double price) {
        System.out.println("Hello " + name + ", the product price has dropped to: $" + price);
    }

}
