package CafeAndClients.decorator;


import static CafeAndClients.decorator.Menu.*;

public class AllOrder implements Order {


    @Override
    public String makeOrder() {

        return "Всё меню: " + "\n"
                +"кофе= "+ COFFEE  + "\n"
                +"cалат= "+ SALAD  + "\n"
                +"cосиски= "+ SAUSAGES  + "\n"
                +"мороженое= "+ ICECREAM  + "\n"
                +"картошка= "+ POTATO  + "\n"
                +"блинчики= "+ PANCAKES  + "\n"
                +"суп= "+ SOUP + "\n"
                +"*******************";
         }

}
