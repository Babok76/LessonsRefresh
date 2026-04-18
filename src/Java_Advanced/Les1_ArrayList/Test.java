package Java_Advanced.Les1_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
/*        int[] mass = new int[3];

        for (int i = 0; i < 4; i++) {
            mass[i]=1;
        }*/


        ArrayList<Integer> list = new ArrayList<>();
        List<Integer> arr = new ArrayList<>(); // в соотвествии с конвенцией, надо ссылать класс на интерфейс (List),
        // те. лучше так объ€вл€ть

        for (int i = 0; i < 10; i++) {
            list.add(i);       //добавить элемент в массив
        }
        list.remove(5); // удаление элмента из массива. Ётот метод remove очень не эффективен -
        // все элементы перенос€тс€ влево на единицу, лучше использовать linkedList
        System.out.println(list);

        System.out.println(list.get(0));  //получить элемент массива
        System.out.println(list.get(8));
        System.out.println("");


        System.out.println(list.size());  //получить размер массива
        System.out.println("");

        for (int i = 0; i < list.size(); i++) { // вывод массива в столбец
            System.out.println(list.get(i));
        }
        System.out.println("");
        for (Integer x : list) { // вывод массива в столбец // дл€ каждого элемента x массива list выводим на экран
            System.out.println(x);
        }

        list.add(5,9);

// проводим много удалений из нашего листа нужно использовать LinkedList
        arr = new LinkedList<>();

    }
}
