package Java_Advanced.Les4_LinkedList;

import java.util.LinkedList;
import java.util.List;

public class TestRepeat {
    public static void main(String[] args) {
        //List<Integer> myNewLinked = new LinkedList<>();
        MyLinledListRepeat mlr = new MyLinledListRepeat();
        mlr.add(1);
        mlr.add(2);
        mlr.add(10);

        System.out.println(mlr);
        System.out.println(mlr.get(1));
        mlr.remove(0);
        System.out.println(mlr);

    }

}

