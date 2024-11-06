public class DeliverOrderHandler extends OrderHandler{
    @Override
    public boolean handle(Order order, OrderHandler orderHandler) {
        if(orderHandler instanceof DeliverOrderHandler){
            order.setStatus("Dostarczono");
            return true;
        } else {
            order.setStatus("Zamownie nie jest jeszcze przygotowane");
            return false;
        }
    }
}
