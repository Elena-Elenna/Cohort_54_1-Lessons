package homework_19;

public class App {
    public static void main(String[] args) {
       double radius = Calculator_19.circleArea(5);
        System.out.println("Площадь круга: " + radius);

        double radius1 = Calculator_19.circumference(10);
        System.out.println("Длинна окружности: " + radius1);

        System.out.println(Calculator_19.circleArea(5));
        System.out.println(Calculator_19.circumference(10));
    }
}
