package CafeAndClients;

import CafeAndClients.builder.Person;
import CafeAndClients.decorator.*;
import CafeAndClients.memento.Caretaker;

public class Runner {

    public static void main(String[] args) {



        Person myPerson = new Person.Builder()
                .withName("Gena")
                .withSurname("Petrov")
                .withAddress("Sovetskia, 41")
                .withAge(32)
                .withPhoneNumber("80445457665")
                .build();
                System.out.println(myPerson.print());


        Order simpleOrder = new SimpleOrder();
        System.out.println(simpleOrder.getInfo());
        System.out.println("summa: " + simpleOrder.getPrice() + '\n');

        simpleOrder = new CheefMenu(simpleOrder);
        System.out.println(simpleOrder.getInfo());
        System.out.println("summa: " +simpleOrder.getPrice()+ '\n');

        simpleOrder = new SeasonalMenu(simpleOrder);
        System.out.println(simpleOrder.getInfo());
        System.out.println("summa: " +simpleOrder.getPrice()+ '\n');

        Order ownOrder = new OwnOrder();
        System.out.println(ownOrder.getInfo());
        System.out.println("summa: " +ownOrder.getPrice()+ '\n');



        OwnOrder ownOrderSave = new OwnOrder();
        Caretaker caretaker = new Caretaker();
        ownOrderSave.setState("saving last order:");

        System.out.printf("State is saved %s\n", ownOrderSave.getState());
        caretaker.add(ownOrderSave.saveState());

        ownOrderSave.setState("recovering last order");
        System.out.printf("State is recovering  %s\n", ownOrderSave.getState());

        ownOrderSave.load(caretaker.get(0));
        System.out.printf("State is recovered  %s\n", ownOrderSave.getState());

        System.out.println("Add something new ");
        System.out.println(ownOrder.getInfo());
        System.out.println("summa: " +ownOrder.getPrice()+ '\n');


     }

}
