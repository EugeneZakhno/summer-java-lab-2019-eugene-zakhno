package CafeAndClients.decorator;

public class OrderDecorator implements Order, Menu {

    Order order;

    public OrderDecorator(Order order){
        this.order = order;
    }

    public OrderDecorator() {

    }


    @Override
    public String makeOrder() {
        return order.makeOrder();
    }


}
