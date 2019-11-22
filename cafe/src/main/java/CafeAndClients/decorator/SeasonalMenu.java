package CafeAndClients.decorator;

public  class SeasonalMenu extends Decorator{

    Order order;

    public SeasonalMenu(Order order){
        this.order = order;
    }

    public SeasonalMenu() {

    }

    public String getInfo() {
        return  "Сезонное меню:" + "\n"
                +"сосиски= " + SAUSAGES + "\n"
                +"картошка= "+ POTATO  + "\n"
                +"суп= "+ SOUP;
    }

    public int getPrice() {
        return SAUSAGES+POTATO+SOUP;
    }
}