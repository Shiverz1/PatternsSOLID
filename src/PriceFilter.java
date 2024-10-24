import java.util.List;
import java.util.stream.Collectors;

// Open/Closed Principle
public class PriceFilter implements ProductFilter {
    private int minPrice;
    private int maxPrice;

    public PriceFilter(int minPrice, int maxPrice) {
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }


    @Override
    public List<Product> filter(List<Product> products) {
        return products.stream()
                .filter(product -> product.getPrice() >= minPrice && product.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }
}
