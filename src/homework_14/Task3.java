package homework_14;
/*
Task 3
Подсчет гласных и согласных
Напишите программу, которая просит пользователя ввести слово
и подсчитывает количество гласных и согласных букв в этом слове.
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово");
        String str = scanner.nextLine();

        int vowels = 0;
        int consonants = 0;
        String vowels1 = "euioayYEUIOA";
        for (int i = 0; i < str.length(); i++){
            char a = str.charAt(i);

            if (Character.isLetter(a)){
                if (vowels1.indexOf(a) != -1){
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Гласные: " + vowels);
        System.out.println("Согласные: " + consonants);

    }
}
