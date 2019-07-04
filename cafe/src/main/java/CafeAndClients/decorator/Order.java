package CafeAndClients.decorator;

public abstract class Order implements Menu{
    String name = "Simple order";

    public String getInfo(){
        return name;
    }

    public abstract int getPrice();
}