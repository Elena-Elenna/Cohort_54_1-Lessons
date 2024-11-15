package lesson_19;

import java.util.Arrays;
import java.util.Scanner;

public class StringBuilderExample {
    public static void main(String[] args) {
        //Это спец.класс, предназначеный для эффективного создания и модификации изменяемых последовательностей символов
        //В отличии от класса String объекты String Builder могут изменяться без создания новых объектов в памяти,
        //что повышает производительность при частых операциях со строками
        String str = "Java" + " " + "is" + " " + "the" + " " + "best";
        System.out.println(str);

        StringBuilder sb = new StringBuilder(); //Конструктор перегружен, может быть пустым, может принимать String
        StringBuilder sb1 = new StringBuilder("Hello");

        // append - Метод для добавления в конец строки (приклеять справа) / аналог конкатенации
        sb1.append(" ");
        sb1.append("World").append("!");

        // toString - Получить строковое представление (String)
        String string = sb1.toString();
        System.out.println(string);

        // insert - Вставить символы или слова в указанную позицию
        sb = new StringBuilder("Hello World");
        sb.insert(6, "beautiful "); // в какую позицию вставлять, и что вставлять
        System.out.println(sb.toString());
        /*
        //beautiful - нужно вставить в середину строки в 6 индекс
        String s = "Hello World";
        String s1 = s.substring(0,6);
        String s2 = s.substring(6);
        System.out.println(s1);
        System.out.println(s2);
        String res = s1 + "beautiful " + s2;
        System.out.println(res);
         */

        // replace - Заменить подстроку (определяется индексами) на указанное значение
        sb = new StringBuilder("Hello World!");
        sb.replace(6,11,"Java"); //верхняя граница не включается
        System.out.println(sb.toString());

        // delete - Удалить подстроку в диапазоне индексов
        sb = new StringBuilder("Hello World!");
        sb.delete(5, 11);
        System.out.println(sb.toString());

        // reverse - разворачивает последовательность символов
        sb = new StringBuilder("Hello World!");
        sb.reverse();
        System.out.println(sb.toString());

        // length - Колличество символов (длинна)
        System.out.println("sb.length: " + sb.length());

        // charAt - Получить символ по индексу
        char ch = sb.charAt(3);
        System.out.println(ch);

        // substring - Плучить подстроку по индексам
        sb = new StringBuilder("Hello World!");
        String subString = sb.substring(1); //от индекса до конца строки
        System.out.println(subString);

        subString = sb.substring(6,9); //от start до end (верхняя граница не включительно
        System.out.println(subString);

        // setLength - Изменять размер последовательности символов
        sb = new StringBuilder("Hello");
        System.out.println(sb.length());
        sb.setLength(10);   //если мы увеличиваем строку,она будет заполнена char с кодом 0
        System.out.println("setLength(10): " + sb.toString());

        char ch1 = sb.charAt(8);
        System.out.println("десятичный код символа: sb.charAt(8): " + (int) ch1);

        sb.setLength(3);
        System.out.println("setLength(3): " + sb.toString());

        //join - соединяет строки с учетом разделителя
        String exampl = String.join(" ", "Java","is","the","best");
        System.out.println(exampl);

        // split - обратный процес join (можно с его помощью из предложения сделать массив строк из слов)
        String[] strings = exampl.split(" ");
        System.out.println(Arrays.toString(strings));
    }
    
}
