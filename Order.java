import java.util.ArrayList;

public class Order {
    private String status;
    private String price;
    private ArrayList<Meal> meals;
    private OrderHandler orderHandler;

    public Order() {
        meals = new ArrayList<>();
        orderHandler = new AcceptOrderHandler();
    }

    public void addMeal(Meal meal){
        meals.add(meal);
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void acceptOrder(){
        if(orderHandler.handle(this, orderHandler)){
            System.out.println("Twoje zamowienie zostalo zlozone");
            orderHandler = new PrepareOrderHandler();
        } else {
            System.out.println("Twoje zamowienie nie zostalo jeszcze zakceptowane");
        }
    }

    public int countDoneMeal(){
        int count = 0;
        for (Meal meal : meals){
            if(meal.isDone()){
                count++;
            }
        }
        return count;
    }

    public ArrayList<Meal> getMeals() {
        return meals;
    }

    public void setStatusMeal(String name) {
        for (Meal meal : meals) {
            if (meal.getName().equals(name)) {
                meal.setDone(true);
                break;
            }
        }
    }

    public void prepareOrder() {
        if(orderHandler instanceof PrepareOrderHandler) {
            if(orderHandler.handle(this, orderHandler)) {
                System.out.println(status);
                orderHandler = new DeliverOrderHandler();
            } else {
                System.out.println(status);
            }
        } else {
            System.out.println("Zamówienie nie zostało zaakceptowane");
        }
    }

    public void deliverOrder(){
        if (orderHandler.handle(this,orderHandler)){
            System.out.println(status);
        } else {
            System.out.println(status);
        }
    }
}
