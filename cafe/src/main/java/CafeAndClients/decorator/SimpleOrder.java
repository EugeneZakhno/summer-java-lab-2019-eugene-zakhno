package CafeAndClients.decorator;

public class SimpleOrder extends Order{

    public SimpleOrder(){
    name = "Простоe меню:" +'\n'
        + "кофе = "+ COFFEE +'\n'
        + "блинчики = "+ PANCAKES;
    }

    public int getPrice(){
        return COFFEE + PANCAKES;
    }
}
