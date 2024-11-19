package homework_19;
/*
Task 3
Неизменяемый объект
Создайте класс ImmutablePoint:
•	Объявите final поля x и y типа int.
•	Инициализируйте их через конструктор.
•	Попытайтесь создать методы-сеттеры для изменения значений x и y.
•	Объясните, почему значения полей не могут быть изменены после создания объекта.
 */

public class ImmutablePoint {

    private final int x;
    private final int y;


    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


//    public void setX(int x) {
//        this.x = x; // Ошибка: поле final нельзя изменить
//    }
//
//    public void setY(int y) {
//        this.y = y;
//    }



    public String toString() {
        return "[x = " + x + "; y = " + y + "]";
    }

    public static void main(String[] args) {
        ImmutablePoint point = new ImmutablePoint(15, 25);
        System.out.println(point);


//         point.setX(30); // Ошибка: не возможно присвоить значение конечной переменной
//         point.setY(40);


        System.out.println("X: " + point.getX());
        System.out.println("Y: " + point.getY());
    }

}
