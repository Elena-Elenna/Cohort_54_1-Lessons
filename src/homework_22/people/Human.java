package homework_22.people;
/*
Task 1
Напишите иерархию классов человек -> спортсмен-любитель -> спортсмен-профи
У человека есть метод бежать (run()).
Обычный человек бежит со скоростью 10 км, любитель 15, профи - 25;
Также у наших спортсменов есть необходимость в отдыхе.
Человек нужен отдых после пробежки 15 минут, любитель 10, профи 5
В методе бежать - вызвать метод, который будет выводить количество минут, необходимых для отдыха спортсменам
 */

public class Human {

    private int runSpeed;
    private int restTime;


    public Human() {
        this.runSpeed = 10;
        this.restTime = 15;
    }


    public void rest(){
        System.out.printf("Человек отдыхает %d минут: \n", + restTime);
    }

    public void run(){
        System.out.printf("\nЧеловек бежит %d км/ч: ", + runSpeed);
        rest();
    }

    public int getRunSpeed() {
        return this.runSpeed;
    }

    public void setRunSpeed(int runSpeed) {
        this.runSpeed = runSpeed;
    }

    public int getRestTime() {
        return this.restTime;
    }

    public void setRestTime(int restTime) {
        this.restTime = restTime;
    }
}
