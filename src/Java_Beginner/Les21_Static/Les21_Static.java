package Java_Beginner.Les21_Static;

public class Les21_Static {
    public static void main(String[] args) {
/*        Human.description = "Bobba";
        Human.getAllFields();
        Human h1 = new Human("Dubbo", 77);*/

        Human h1 = new Human("Dubbo", 77);
        Human h2 = new Human("Tom", 86);
        Human h3 = new Human("Deris", 15);
/*        Human.description = "Bobba";
        h1.getDesc();
        h2.getDesc();
        Human.description = "Asss";
        h1.getDesc();
        h2.getDesc();*/

        System.out.println(Math.pow(2, 4)); // у класса Math - тольео статичные переменные и методы
        System.out.println(Math.PI);

        h1.printNumberPeople();
        h2.printNumberPeople();
    }
}

class Human {

    private String name;
    private int age;
    private static int countPeople; //Одна перепенная для всех объектов

    public static String description;
    public static int x;


    public Human(String name, int age) { //Конструктор2
        System.out.println("данные из 2-ого конструктора");
        this.name = name;
        this.age = age;
        countPeople++;
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

    public void getDesc() {
        for (int i = 0; i <= 3; i++) {
            System.out.println(name + ", " + age + ", " + description);
        }
    }

    public static void getAllFields() { // работатет тольео со статическими переменными
        System.out.println(description);
    }

    public void printNumberPeople() {
        System.out.println("Колво людей: " + countPeople);
    }
}


