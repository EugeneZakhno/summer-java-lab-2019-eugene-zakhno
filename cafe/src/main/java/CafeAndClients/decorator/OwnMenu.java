package CafeAndClients.decorator;


public class OwnMenu extends OrderDecorator {


    public OwnMenu(Order order) {
        super(order);
    }

    public OwnMenu() {
        super();
    }

    public String sendOwnMenu() {

       return "\nсобственное меню: " + "\n"
                + "кофе= "+ COFFEE  + "\n"
                + "блинчики= "+ PANCAKES + "\n"
                + "Сумма заказа= " + summaOwnMenu()+ "\n"
                + "*******************";
       }

    public int summaOwnMenu(){
        return COFFEE + PANCAKES;
    }

    @Override
    public String makeOrder() {
        return super.makeOrder()+ sendOwnMenu();
    }
}
