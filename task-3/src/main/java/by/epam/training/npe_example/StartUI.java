package by.epam.training.npe_example;

public class StartUI {

    private final Tracker tracker;

    public StartUI(final Tracker tracker) {
         this.tracker = tracker;
    }

    public  void init () {
        this.tracker.add(new Item());
    }

    public static void main(String[] args) {

        new StartUI(new Tracker()).init();

      /*  Integer value = null;
        int size = value;  //Unboxing*/


    }

}
