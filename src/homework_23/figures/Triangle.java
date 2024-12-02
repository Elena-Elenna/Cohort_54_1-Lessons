package homework_23.figures;


public class Triangle extends Shape{

    private double a;
    private double b;
    private double c;


    public Triangle(String type, double a, double b, double c) {
        super(type);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //TODO нужна какая-то проверка (иногда сумму площадей фигур выводит NaN)


    @Override
    public double area() {
        double s = perimeter() / 2;
        return  Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

}
