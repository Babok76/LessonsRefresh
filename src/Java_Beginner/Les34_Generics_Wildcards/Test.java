package Java_Beginner.Les34_Generics_Wildcards;

import java.util.ArrayList;
import java.util.List;

public class Test { //WildCard - ��� ����������� ��� ArrayList
    public static void main(String[] args) {
        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Animal(1));
        listOfAnimals.add(new Animal(2));

        test(listOfAnimals);

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(listOfDogs);

        //Object object = new Object();
        //Object - �������� ������������
        //Animal
        //Dog

    }

    //private static void test(List<Animal> list) {
    private static void test(List<? extends /*super*/ Animal>  list) { // super ����� ��������, �� ��� ����� ���� Animal � �������� ������������
        for (Animal animal : list) {
            animal.eat();
            //System.out.println(animal);
        }
    }
}
