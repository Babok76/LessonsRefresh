package Java_Advanced.Les3_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
/*        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.get(0);
        linkedList.size();
        linkedList.remove(0);*/

        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        // [1][2][3][4]  - элемент добавляется в конец массива Для ArrayList для add(i), в массиве get отрабатывается очень быстро
        // [5][1][2][3][4]  - элемент добавляется в начало массива Для ArrayList add(0,i), все элементы сдвигаются вправо на единиц
        // [1]->[2]->[3] - для LinkedList get идет по всем элементам (по цепочке узлов, узел+ссылка на следующий узел)
        // head-> [5] -> [1]->[2]->[3] для LinkedList, для add добавляет элемент head и ссылку, и смещается весь лист, а не каждый элемент
        // считывание и добавление в конец листа - гораздо быстрее для ArrayList
        // удаление элементов или добавление в начало листа - быстрее для  LinkedList

        measureTimeAdd1(arrayList);
        measureTimeAdd2(linkedList);

    }

    private static void measureTimeAdd2(List<Integer> list) {
/*        for (int i = 0; i < 100000; i++) {
            list.add(i); //значения добавляются в конец массива
        }*/
        long start = System.currentTimeMillis(); // возвращает текущее время в милисекундах
/*        for (int i = 0; i < 100000; i++) {
            list.get(i);
        }*/
        for (int i =0; i<100000; i++){
            list.add(0,i); //значения добавляются в позицию 0

        }
        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }

    private static void measureTimeAdd1(List<Integer> list) {
/*        for (int i = 0; i < 100000; i++) {
            list.add(i); //значения добавляются в конец массива
        }*/
        long start = System.currentTimeMillis(); // возвращает текущее время в милисекундах
/*        for (int i = 0; i < 100000; i++) {
            list.get(i);
        }*/
        for (int i =0; i<100000; i++){
            list.add(i);

        }
        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }

}
