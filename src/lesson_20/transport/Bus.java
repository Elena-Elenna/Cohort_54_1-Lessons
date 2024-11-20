package lesson_20.transport;

//Smartphone is-a Vehicle - НЕ верно. Наследоваться нельзя.
//Bus is-a Vehicle -> Верно. Можно применять наследование.
public class Bus extends Vehicle {
    /*
   A extends B -> А наследуется от класса В (класс А расширяет класс В)
   A - потомком (ребенком, наследником), В - родитель (родительский класс)
     */

    private int capacity; // вместимость
    private int countPassengerrs; // сколько сейчас пассажиров в автобусе

    public Bus(String model, int capacity, int year){
        // Нужно сначала создать объект родителя
        // Вызов конструктора родительского класса
        super(model,year); //ключевое super слово обращение к родителю
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengerrs() {
        return countPassengerrs;
    }

    // Взять на борт одного пассажира
    public boolean takePasstngers(){
        if(countPassengerrs < capacity){ // проверка - есть ли свободное место
            countPassengerrs++;
            System.out.println("Пассажир зашел в автобус: " + model);
            return  true;
        }
        // по сути пишу блок else
        System.out.printf("В автобусе %s больше нет мест. Сейчас %d пассажиров\n",
                this.getModel(), countPassengerrs);
        return false;
    }

    //высадка пассажира из автобуса
    public boolean dropPassengers(){
        if (countPassengerrs > 0){ //проверка - есть ли в автобусе пассажиры
            countPassengerrs--;
            System.out.println("Пассажир вышел из автобуса" + model);
            return true;
        }
        System.out.printf("В автобусе %s больше нет пассажиров\n", model);
        return false;
    }
}
