package Java_Advanced.Les8_InterfaceSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        hashSet.add("Bob");
        hashSet.add("Alisa");
        hashSet.add("Zonder");
        hashSet.add("Krips");
        hashSet.add("Limba");
        hashSet.add("Limba");
        hashSet.add("Limba");

        System.out.println(hashSet.contains("Bob")); // в set этот метод работает очень быстро, потому что используется хеширование
        System.out.println(hashSet.contains("Bobi"));
        System.out.println();
        System.out.println(hashSet.isEmpty());
        System.out.println(hashSet);


/*        for (String name : hashSet) {
            System.out.println(name);
        }
        System.out.println();
        System.out.println(hashSet);*/

        //union - объединение множеств
        Set<Integer> hassSetIndex = new HashSet<>();

        hassSetIndex.add(1);
        hassSetIndex.add(2);
        hassSetIndex.add(0);
        hassSetIndex.add(3);
        hassSetIndex.add(4);
        hassSetIndex.add(5);


        Set<Integer> hSI2 = new HashSet<>();
        hSI2.add(2);
        hSI2.add(3);
        hSI2.add(4);
        hSI2.add(5);
        hSI2.add(6);
        hSI2.add(7);
        hSI2.add(8);

        Set<Integer> union = new HashSet<>(hassSetIndex);
        union.addAll(hSI2); //объединение множеств

        System.out.println(union);

        //перечечение - intersection
        Set<Integer> intersection = new HashSet<>(hassSetIndex);
        intersection.retainAll(hSI2);

        System.out.println(intersection);

        //разность множеств difference
        Set <Integer> diff = new HashSet<>(hassSetIndex);
        diff.removeAll(hSI2);

        System.out.println(diff);
    }


}
