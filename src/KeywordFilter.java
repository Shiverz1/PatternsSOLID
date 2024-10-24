import java.util.List;
import java.util.stream.Collectors;

// Open/Closed Principle
public class KeywordFilter implements ProductFilter {
    private String keyword;

    public KeywordFilter(String keyword) {
        this.keyword = keyword;
    }


    @Override
    public List<Product> filter(List<Product> products) {
        return products.stream()
                .filter(product -> product.getName().contains(keyword))
                .collect(Collectors.toList());
    }
}
