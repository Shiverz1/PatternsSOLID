import java.util.List;
import java.util.stream.Collectors;

public interface ProductFilter {
    List<Product> filter(List<Product> products);
}

