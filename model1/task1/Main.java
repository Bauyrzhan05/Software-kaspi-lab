package software_kaspi_lab.Model1.task1;

public class Main {
    public static void main(String[] args) {
        CartService cart = new CartService();

        cart.addOrder(new OrderEntity("Burger", "Food", 2500));
        cart.addOrder(new OrderEntity("Pizza", "Food", 3000));
        cart.addOrder(new OrderEntity("Cola", "Drink", 600));
        cart.addOrder(new OrderEntity("Coffee", "Drink", 1200));

        for (OrderEntity order: cart.findOrdersAbovePrice(1000)){
            System.out.println(order.getName() +" - "+ order.getPrice());
        }

        cart.groupByCategory().forEach((category, quantity) ->
                System.out.println(category +": "+ quantity)
        );

    }
}
