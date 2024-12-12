package homework_26.task_3;

public class NumericPair <T extends Number, V extends Number>{

    private T value;
    private V value1;


    public NumericPair(T value, V value1) {
        this.value = value;
        this.value1 = value1;
    }

    public double sum() {
        return value.doubleValue() + value1.doubleValue();
    }
}
