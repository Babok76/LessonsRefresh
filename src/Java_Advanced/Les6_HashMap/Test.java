package Java_Advanced.Les6_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map <Integer, String> map = new HashMap<>();
        map.put(1,"����");
        map.put(2, "���");
        map.put(3,"���");

        for (Map.Entry<Integer, String> entry:map.entrySet()) {
            System.out.println(entry.getKey()+"."+entry.getValue());
        }

/*        System.out.println(map);
        map.put(3, "������ ��� 3");
        System.out.println(map);
        System.out.println(map.get(3));*/


    }
}
