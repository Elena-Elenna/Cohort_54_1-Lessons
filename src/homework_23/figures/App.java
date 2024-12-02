package homework_23.figures;

public class App {
    public static void main(String[] args) {

        Triangle triangle = new Triangle("Треугольник: ", 5, 5, 5);
        System.out.println(triangle);

        Rectangle rectangle = new Rectangle("Прямоугольник",10, 15);
        System.out.println(rectangle);

        Circle circle = new Circle("Круг", 2.5);
        System.out.println(circle);

        System.out.println("+++++++++++++++++");

        Shape[] shape = new Shape[3];
        shape[0] = new Triangle("Треугольник", 5, 5,10);
        shape[1] = new Circle("Круг", 5.5);
        shape[2] = new Rectangle("Прямоугольник", 20, 10);

        double sumaArea = 0;
        double sumaPerimeter = 0;

        for (int i = 0; i < shape.length; i++) {
            Shape shapes = shape[i];
            System.out.print(shapes.getClass().getSimpleName() + " площадь: " + shapes.area());
            System.out.println("; периметр: " + shapes.perimeter());

            sumaArea += shapes.area();
            sumaPerimeter += shapes.perimeter();
            System.out.println("================\n");
        }

        System.out.printf("Сумма площадей фигур: %.1f\n", sumaArea);
        System.out.printf("Сумма периметров фигур: %.1f\n", sumaPerimeter);
    }
}
