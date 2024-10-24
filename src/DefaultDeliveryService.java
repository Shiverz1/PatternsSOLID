// Dependency Inversion Principle
public class DefaultDeliveryService implements DeliveryService {

    @Override
    public void trackOrder(Order order) {
        System.out.println("Tracking order: " + order.getId());
    }
}
