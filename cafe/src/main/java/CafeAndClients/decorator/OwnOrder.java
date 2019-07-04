package CafeAndClients.decorator;

import CafeAndClients.memento.Memento;

public class OwnOrder extends Order {

    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento saveState() {
        return new Memento(state);
    }

    public void load(Memento memento) {
        this.state = memento.getState();
    }

   @Override
    public String getInfo() {
        return  "Собственное меню:" + "\n"
                +"блинчики= " + PANCAKES + "\n"
                +"суп= "+ SOUP;
    }

    @Override
    public int getPrice()
    {
        return PANCAKES+SOUP;
    }
}
