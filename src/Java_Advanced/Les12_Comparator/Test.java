package Java_Advanced.Les12_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("dog666");
        animals.add("cat4");
        animals.add("frog55");
        animals.add("bird");
        animals.add("a");
        animals.add("re");

        Collections.sort(animals, new StringLengthComparator());
        System.out.println(animals);
//-------------------------------------------------------------------
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(4);
        numbers.add(0);
        numbers.add(500);
        numbers.add(100);

        Collections.sort(numbers, new BackwardIntegerComparator());
        System.out.println(numbers);
//---------------------
        Collections.sort(numbers, new Comparator<Integer>() { //Анонимный класс
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return -1;
                } else if (o1 < o2) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(numbers);
//-----------------------------------------------------------------------
        List<Person> pers = new ArrayList<>();
        pers.add(new Person(2, "bob"));
        pers.add(new Person(1, "katt"));
        pers.add(new Person(3, "mike"));

        Collections.sort(pers, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getId()>o2.getId()){
                    return 1;
                } else if (o1.getId()<o2.getId()) {
                    return -1;
                }else {
                    return 0;
                }
            }
        });
        System.out.println(pers);
//------------------------------------------------------------------------
    }
}

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        /*
        o1>o2=>1
        o1<o1=>-1
        o1==o2=>0
         */
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        } else {
            return 0;
        }
    }
}
//----------------------------------------------------------------------
class BackwardIntegerComparator implements Comparator<Integer> {

/*    @Override
    public int compare(Integer o1, Integer o2) {

        if (o1>o2){
            return 1;
        } else if (o1<o2) {
            return -1;
        }else {
            return 0;
        }
    }*/

    @Override
    public int compare(Integer o1, Integer o2) {

        if (o1 > o2) {
            return -1;
        } else if (o1 < o2) {
            return 1;
        } else {
            return 0;
        }
    }
}
//----------------------------------------------------------------------------------
class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId(){
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
