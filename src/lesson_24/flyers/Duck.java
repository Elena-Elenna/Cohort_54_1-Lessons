package lesson_24.flyers;

//Поддержка множественной реализации.
//Класс может реализовывать любще количество интерфейсов.
//Это позволяет нам частично обойти ограничения на множественное наследование.

public class Duck implements Flyable, Swimmable {


    @Override
    public void fly() {
        System.out.println("Duck flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck swimming");

    }
}
