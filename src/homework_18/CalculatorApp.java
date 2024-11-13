package homework_18;

public class CalculatorApp {
    public static void main(String[] args) {
        int add = Calculator.add(5,5);
        System.out.println("add: " + add);

        int add1 = Calculator.add(5,5,5,5);
        System.out.println("add1: " + add1);

        int subtract = Calculator.subtract(10,5);
        System.out.println("subtract: " + subtract);

        int mult = Calculator.multiply(2,2);
        System.out.println("mult: " + mult);

        int div = Calculator.divide(10,0);
        System.out.println("dividire 0: " + div);

        int divid = Calculator.divide(10,2);
        System.out.println("dividire: " + divid);

        double div1 = Calculator.divide(10,0);
        System.out.println("dividire 0: " + div1);

        double divid1 = Calculator.divide(10,2);
        System.out.println("dividire: " + divid1);
    }
}
