public class Main {
    public static void main(String[] args) {
        Orders orders = new Orders();
        Order order1 = new Order();
        Order order2 = new Order();

        order1.addMeal(new Meal("Frytki",2));
        order1.addMeal(new Meal("Hamburger",1));

        order1.prepareOrder(); //Przed zaakceptowaniem zamowienia chcemy zaznaczyć, że jest gotowe ale wyświetli nam infomacja: Zamówienie nie zostało zaakceptowane
        orders.addOrder(order1);//Dodajemy zamownie

        order1.prepareOrder();// Przed przyrządzeniem posiku chcemy zaznaczyć, że jest gotowe ale już jest zaakceptowane i wyświetli: Zamowinie nie jest jeszcze przygotowane

        order1.setStatusMeal("Frytki");

        order1.deliverOrder(); // Nie możemy dostarczyć posiłku przed jego ukończeniem więc wyświetli Zamowinie nie jest jeszcze przygotowane

        order1.setStatusMeal("Hamburger");
        order1.prepareOrder(); // Jak wszystko jest gotowe to pokaże się nam: Przygotowane

        order1.deliverOrder();//Wszystko jest gotowe więc możemy dostarczyć.
    }
}
