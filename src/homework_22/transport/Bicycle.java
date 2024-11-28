package homework_22.transport;

public class Bicycle extends Vechikle{


    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Bicycle doesn't have an engine.");
    }
}
