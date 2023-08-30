package Les33_Generics;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
///////////////////Java5///////////////////////////////
        List list = new ArrayList(); // здесь могут хранитс€ любые переменные и объекты
        Animal ourAnimal = new Animal();
        list.add("cat");
        list.add("dog");
        list.add("frog");
        list.add(ourAnimal);

        String anim = (String) list.get(3);
        System.out.println(anim);
/////////////////Generic/////////////////////////////
        List<String> anim2 = new ArrayList<String>(); // здесь могут хранитс€ только переменные типа String
        anim2.add("cat");
        anim2.add("dog");
        anim2.add("frog");

        String anim3= (String) anim2.get(2);
        System.out.println(anim3);
/////////////////Java7//////////////////////////////
List<String> anim4 = new ArrayList<>();
    }
}

class Animal{

}