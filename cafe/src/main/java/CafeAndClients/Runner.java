package CafeAndClients;

import CafeAndClients.builder.Person;
import CafeAndClients.decorator.*;
import CafeAndClients.memento.Caretaker;
import CafeAndClients.memento.Originator;


public class Runner {

    public static void main(String[] args) {


        //1 Builder
        Person myPerson = new Person.Builder()
                .withName("Gena")
                .withSurname("Petrov")
                .withAddress("Sovetskia, 41")
                .withAge(32)
                .withPhoneNumber("80445457665")
                .build();
                System.out.println(myPerson.print());

        //2 Decorator
        Order myOwnOrder = new OwnMenu(new AllOrder());
        System.out.println(myOwnOrder.makeOrder());

        //3 Memento
        OwnMenu ownMenu = new OwnMenu();
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("saving last order");
        System.out.printf("State is %s\n", originator.getState());
        caretaker.setMemento(originator.saveState());

        originator.setState("recovering last order");
        System.out.printf("State is %s\n", originator.getState());

        originator.restoreState(caretaker.getMemento());
        System.out.printf("State is %s\n", originator.getState());



     }

}
