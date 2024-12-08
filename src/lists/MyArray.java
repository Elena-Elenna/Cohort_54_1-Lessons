package lists;

public class MyArray {

    private int[] array;
    private int cursor; // присвоено значение по умолчание - 0;


    public MyArray() {
        array = new int[10];
    }


    // 0. Конструктор, который принимает обычный массив и создает MagicArray с такими же значениями

    public MyArray(int[] ints) {
        if (ints != null) {
            this.array = new int[ints.length * 2];
            addAll(ints);
        } else {
            this.array = new int[10];
        }
    }


    // 1. Добавление в массив одного элемента

    public void add(int value) {
        if (cursor == array.length - 1) {         // Курсор указывает на последнюю свободную ячейку
                                                  // Проверка. Есть ли свободное места во внутреннем массиве
            expandArray();                        // Если места нет - нужно добавить место
        }                                         // Расширить массив перед добавлением нового элемента
        array[cursor] = value;
        cursor++;
    }


    // 2. Динамическое расширение массива

    private void expandArray() {
        System.out.println("Расширяем массив! cursor: " + cursor);
        int[] newArray = new int[array.length * 2];      // 1.Создать массив большего размера (в 2 раза больше)
        for (int i = 0; i < cursor; i++) {               // 2.Переписать в новый массив все значения из старого (до курсора)
            newArray[i] = array[i];                      // Переписываю все значения из старого массива
        }
        array = newArray;                                // 3.Перебрасываем ссылку. Переменная array хранила ссылку на "новый" массив
        System.out.println("Расширение массива завершено");
    }


    // 3. Добавление в массив нескольких элементов

    public void addAll(int... values) {
        for (int i = 0; i < values.length; i++) {
            add(values[i]);                                // с values я могу обращаться точно также, как со ссылкой на массив int
        }
    }


    // 4. Удаление элемента по индексу

    public int remove(int index) {
        if (index < 0 || index >= cursor) {            //1.Проверить валидность индекса (что он не отрицательный и меньше курсора)
            return Integer.MIN_VALUE;                  // Индекс не валидный. Ничего в массиве не трогаем
        }
        int value = array[index];                      // 2.Запомнить, какое значение находилось под этим индексом
        for (int i = index; i < cursor - 1; i++) {     //3.Удалить значение из ячейки
            array[i] = array[i + 1];                   //4.Передвинуть все элементы за индексом на 1 ячейку влево
        }
        cursor--;                                      //5. Передвинуть курсор влево
        return value;                                  //6.Вернуть старое значение
    }


    // 5. Текущее количество элементов в массиве

    public int size() {
        return cursor;
    }


    // 6. Возвращает строковое представление массива

    public String toString() {
        if (cursor == 0) return "[]";
        String result = "[";                                         //Открыть скобочку.
        for (int i = 0; i < cursor; i++) {                           //Перебрать элементы.
            result = result + array[i] + ((i < cursor - 1) ? ", " : "]");
                                                                     //Добавить каждый элемент, добавить запятую (если элемент не последний)
        }                                                            //Закрыть скобочку
        return result;
    }


    // 7. Поиск элемента по значению indexOf - находит индекс первого вхождения

    public int indexOf(int value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) {
                return i;                                             // (вернуть индекс, если такое значение есть в массиве)
            }
        }
        return -1;
    }


    // 8. Поиск элемента по значению lastIndexOf - находит индекс последнего вхождения

    public int lastIndexOf(int value){
        for (int i = cursor - 1; i >= 0; i--){
            if (array[i] == value){
                return i;
            }
        }
        return -1;
    }


    // 9. Возвращение значения по индексу

    public int get(int index) {
        if (index >= 0 && index < cursor) {
            return array[index];
        }
        return Integer.MIN_VALUE;
    }


    // 10. Метод, который возвращает все значения в виде обычного массива

    public int[] toArray() {
        int[] newArr = new int[cursor];
        for (int i = 0; i < cursor; i++) {
            newArr[i] = array[i];
        }
        return newArr;
    }


    // 11. Удаление элемента по значению

    public boolean removeByValue(int value) {
        int index = indexOf(value);
        if (index >= 0) {
            remove(index);
            return true;
        }
        return false;
    }


    // 12. Замена значения по индексу (есть индекс и новое значение) - возвращает старое значение

    public int set(int index, int newValue) {

        if (index < 0 || index >= cursor) {               //Валидация индекса 0....cursor
            return Integer.MIN_VALUE;

        }
        int oldValue = array[index];                     //Вытащить старое значение - запомнить
        array[index] = newValue;                         //Записать новое значение
        return oldValue;                                 //Вернуть старое значение
    }
}



