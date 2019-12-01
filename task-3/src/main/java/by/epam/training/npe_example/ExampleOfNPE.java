package by.epam.training.npe_example;

public class ExampleOfNPE {

    public static void main(String[] args) {

        String name= null;
        // 1. Когда возникает ?
        //NPE возникает когда мы хотим вызвать метод через ссылку (переменную) иницилизированную как NULL;

        // Это костыль
        // Первый случай:
        //if(name!=null)
        System.out.println(name.length());

        // 2. Как бороться?
        // 2.1 Не использовать явную инициализацию null  т.е. так нельзя String name= null;

        // Второй случай
        Integer value = null;
        int size = value;  //Unboxing
       // System.out.println(name.length());
        // 3. Как бороться?
        // Используй приметивные типы










    }
}
