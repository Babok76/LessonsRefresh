package Java_Advanced.Les4_LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //List<Integer> linkList = new LinkedList<>();
        MyLinkedList my1 = new MyLinkedList();
        my1.add(1);
        my1.add(2);
        my1.add(10);

        System.out.println(my1);
        System.out.println(my1.get(1));

    }
}
