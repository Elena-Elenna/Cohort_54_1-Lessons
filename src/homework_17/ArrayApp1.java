package homework_17;

import java.util.Arrays;

public class ArrayApp1 {
    public static void main(String[] args) {
       int [] array = {10,20,30,40,50};
       MagicArrayHW17 magicArray = new MagicArrayHW17(array);
        System.out.println(magicArray.toString());
        System.out.println("magicArray.lastIndexOf: " + magicArray.lastIndexOf(20));
        System.out.println("magicArray.toArray: " + Arrays.toString(magicArray.toArray()));
    }
}
