public class PrepareOrderHandler extends OrderHandler {

    @Override
    public boolean handle(Order order, OrderHandler orderHandler) {
        if (order.countDoneMeal() == order.getMeals().size()) {
            order.setStatus("Przygotowane");
            return true;
        } else {
            order.setStatus("Zamowinie nie jest jeszcze przygotowane");
            return false;
        }
    }
}
