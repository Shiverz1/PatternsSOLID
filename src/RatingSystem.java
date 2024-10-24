import java.util.HashMap;
import java.util.Map;

// Single Responsibility principle
public class RatingSystem {
    private Map<Product, Double> ratings;
    private double defaultRating = 0.0;

    public RatingSystem() {
        this.ratings = new HashMap<>();
    }

    public void rateProduct(Product product, double rating) {
        ratings.put(product, rating);
    }

    public double getAverageRating(Product product) {
        return ratings.getOrDefault(product, defaultRating);
    }
}
