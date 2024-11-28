package homework_22.transport;

public class App {
    public static void main(String[] args) {

        Car car = new Car();
        car.startEngine();
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.startEngine();
        Bicycle bicycle = new Bicycle();
        bicycle.startEngine();

        System.out.println("========================");
        Vechikle vechikle1 = new Car();
        Vechikle vechikle2 = new Motorcycle();
        Vechikle vechikle3 = new Bicycle();
        Vechikle[] vechikle = new Vechikle[3];
        vechikle[0] = vechikle1;
        vechikle[1] = vechikle2;
        vechikle[2] = vechikle3;

        for (int i =0; i < vechikle.length; i++){
            vechikle[i].startEngine();
        System.out.println(vechikle[i]);
        }
    }
}
