package Java_Advanced.Les7_LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>(); //внутри не гарантируется порядка
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(); //в каком порядке пары были добавлены, в таком порядке они и вернуться
        Map<Integer, String> treeMap = new TreeMap<>(); //значения будут осортированы по ключу (можно задать ключ сортировки или "естественный порядок")

        testMap(hashMap);
        System.out.println();
        testMap(linkedHashMap);
        System.out.println();
        testMap(treeMap);
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(39, "Bob");
        map.put(12, "Trim");
        map.put(75, "Bob");
        map.put(0, "Dib");
        map.put(1500, "Lewis");
        map.put(7, "Bob");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "." + entry.getValue());
        }

    }
}

