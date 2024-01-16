package Java_Advanced.Les9_HashcodeEquals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
/*        Map<Integer, String> map1 = new HashMap<>();
        Set<Integer> set1 = new HashSet<>();*/

/*        map1.put(1,"Bob");
        map1.put(1,"Bob1");
        map1.put(1,"Bob1");

        System.out.println(map1);

        set1.add(1);
        set1.add(1);
        System.out.println(set1);*/

        Map<Person, String> map1 = new HashMap<>();
        Set<Person> set1 = new HashSet<>();

/*        set1.add("Hello");
        set1.add("Hello");

        Integer x =1;
        x.equals();
        x.hashCode();*/

        Person ps1 = new Person(1, "mike1");
        Person ps2 = new Person(1, "mike1");

        map1.put(ps1, "123");
        map1.put(ps2,"345");

        set1.add(ps1);
        set1.add(ps2);

        System.out.println(map1);
        System.out.println(set1);
    }
}

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;

    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}