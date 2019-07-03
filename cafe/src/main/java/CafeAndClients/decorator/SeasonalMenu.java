package CafeAndClients.decorator;


public class SeasonalMenu extends OrderDecorator {

    public SeasonalMenu(Order order) {
        super(order);
    }


    public String sendSeasonalMenu() {
        System.out.println("Cезонное меню: " + "\n"
                +"картошка: "+ POTATO  + "\n"
                +"блинчики: "+ PANCAKES  + "\n"
                +"суп: "+ SOUP + "\n" + "********************");
        return "\nCумма: " + summaSeasonalMenu();
    }

    public int summaSeasonalMenu(){
        return POTATO + PANCAKES + SOUP;
    }

    @Override
    public String makeOrder() {
        return super.makeOrder() + sendSeasonalMenu();
    }
}
