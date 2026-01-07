package software_kaspi_lab.Model1.task3;

import java.time.LocalDateTime;
import java.util.Set;

public record Order(
        Long id,
        Double price,
        LocalDateTime orderDate,
        Set<String> items
) {
    public Order {
        if (price == null || price <= 0) {
            throw new IllegalArgumentException("Price must be greater than 0");
        }

        if (orderDate == null || orderDate.isAfter(LocalDateTime.now())) {
            throw new IllegalArgumentException("Order date must be in the past");
        }

        items = Set.copyOf(items);
    }
}
