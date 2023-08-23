package Les20_Constructor;

import java.util.Scanner;

public class Les20_Constructor {
    public static void main(String[] args) {
        Human h1 = new Human("ddd",34);
/*        Scanner s = new Scanner(System.in);
        System.out.println("Введите Имя ");
        String str = s.nextLine();

        Scanner x = new Scanner(System.in);
        System.out.println("Введите Возраст ");
        int strInt = x.nextInt();

        h1.setName(str);
        h1.setAge(strInt);*/
        h1.calculateAge();
    }
}

class Human {

    private String name;
    private int age;

    public Human() { //Конструктор1
        System.out.println("данные из 1-ого конструктора");
        this.name = "Имя по умолчанию";
        this.age = 0;
    }

    public Human(String name, int age) { //Конструктор2
        System.out.println("данные из 2-ого конструктора");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void calculateAge() {
        int difYears = 65 - age;
        System.out.println("До пенсии осталось: " + difYears);
        ;
    }
}
