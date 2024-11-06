import java.util.ArrayList;

public class Orders {
    private ArrayList<Order> orders;

    public Orders() {
        orders = new ArrayList<>();
    }

    public void addOrder(Order order){
        orders.add(order);
        order.acceptOrder();
    }

}
