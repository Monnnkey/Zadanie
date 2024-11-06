public abstract class OrderHandler {
    private OrderHandler orderHandler;

    public void nextHandler(OrderHandler orderHandler){
        this.orderHandler = orderHandler;
    }

    public abstract boolean handle(Order order, OrderHandler orderHandler);
}
