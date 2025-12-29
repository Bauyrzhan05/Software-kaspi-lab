package software_kaspi_lab.Model1.task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CartService {
    private List<OrderEntity> orders = new ArrayList<>();

    public void addOrder(OrderEntity order){
        orders.add(order);
    }

    public List<OrderEntity> findOrdersAbovePrice(double price){
        List<OrderEntity> result = new ArrayList<>();

        for (OrderEntity order: orders){
            if (order.getPrice() > price){
                result.add(order);
            }
        }
        return result;
    }

    public Map<String, Integer> groupByCategory(){
        Map<String, Integer> categoryCount = new HashMap<>();

        for (OrderEntity order: orders){
            String category = order.getCategory();
            categoryCount.put(category, categoryCount.getOrDefault(category, 0) + 1);
        }
        return categoryCount;
    }
}
