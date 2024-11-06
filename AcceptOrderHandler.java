public class AcceptOrderHandler extends OrderHandler{

    @Override
    public boolean handle(Order order, OrderHandler orderHandler) {
        order.setStatus("Zatwierdzony, jest przygotowywany");
        return true;
    }
}
