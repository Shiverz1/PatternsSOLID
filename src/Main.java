import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final int MIN_PRICE = 50;
    public static final int MAX_PRICE = 100;

    public static void main(String[] args) {
        // Инициализация данных
        List<Product> products = new ArrayList<>();
        products.add(new Product("1", "Product 1", "Category 1", 200));
        products.add(new Product("2", "Product 2", "Category 2", 100));
        products.add(new Product("3", "Product 3", "Category 1", 50));

        // Фильтрация товаров
        ProductFilter priceFilter = new PriceFilter(MIN_PRICE, MAX_PRICE);
        List<Product> filteredProducts = priceFilter.filter(products);
        System.out.println("Фильтрованные товары по цене:");
        filteredProducts.forEach(product -> System.out.println(product.getName()));

        // Добавление товаров в корзину
        Basket basket = new Basket();
        basket.addProduct(products.get(1));
        System.out.println("Товары в корзине:");
        basket.getProducts().forEach(product -> System.out.println(product.getName()));

        // Трекинг заказа
        DeliveryService deliveryService = new DefaultDeliveryService();
        Order order = new Order("1", basket.getProducts());
        deliveryService.trackOrder(order);

        // Система рейтинга
        RatingSystem ratingSystem = new RatingSystem();
        ratingSystem.rateProduct(products.get(1), 4.5);
        System.out.println("Рейтинг товара: " + products.get(1).getName() + " " + ratingSystem.getAverageRating(products.get(1)));
    }
}
