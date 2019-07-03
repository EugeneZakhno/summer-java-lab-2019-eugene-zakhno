package CafeAndClients.decorator;

public class CheefMenu extends OrderDecorator {

    public CheefMenu(Order order) {
        super(order);
    }


    public String sendCheefMenu(){

        System.out.println("Меню от шефповара: " + "\n"
                +"мороженое: "+ ICECREAM  + "\n"
                +"блинчики: "+ PANCAKES);
        return "\nCумма: " + summaCheefMenu();
    }

    public int summaCheefMenu() {
        return ICECREAM + PANCAKES;
    }

    @Override
    public String makeOrder() {
        return super.makeOrder() + sendCheefMenu();
    }
}
