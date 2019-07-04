package CafeAndClients.decorator;

public class CheefMenu extends Decorator{

    Order order;

    public CheefMenu(Order order){
        this.order = order;
    }

    public CheefMenu() {

    }

    public String getInfo() {
        return  "Меню от шеф-повара:" + "\n"
                +"cалат= " + SALAD + "\n"
                +"кофе= "+ COFFEE  + "\n"
                +"мороженое= "+ ICECREAM  + "\n"
                +"блинчики= "+ PANCAKES;
    }

    public int getPrice() {
        return SALAD+COFFEE+ICECREAM+PANCAKES;
    }

}
