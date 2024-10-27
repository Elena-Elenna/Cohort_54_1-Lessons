package lesson_05;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        // Подготовка программы к чтению данных пользователя
        Scanner scanner = new Scanner(System.in);

        // Спросить имя
        System.out.println("Введите ваше имя: ");
        String name = scanner.nextLine();
        System.out.println(name + 1);

        // Спросить возвраст
        System.out.println("Введите ваш возраст: ");
        int age = scanner.nextInt();
        // Обнулить сканер /скушать хвост строки
        scanner.nextLine();
        System.out.println(age +1);

        // Введите колличество детей
        System.out.println("Введите колличество детей: ");
        int deti = scanner.nextInt();
        scanner.nextLine();
        System.out.println(deti);

        // Мы можем получить double
        System.out.println("Введите double: ");
        double var = scanner.nextDouble();
        System.out.println(var);

    }
}
