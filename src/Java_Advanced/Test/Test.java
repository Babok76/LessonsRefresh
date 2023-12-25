package Java_Advanced.Test;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> AList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            AList.add(i);
        }
        System.out.println(AList);
        System.out.println(AList.get(0));
        System.out.println(AList.size());

        for (int i = 0; i < AList.size(); i++) {
            System.out.println(AList.get(i));
        }
        for (Integer x : AList)
            System.out.println(x);
    }
}
