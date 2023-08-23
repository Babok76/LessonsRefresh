package Les14_15_ClassesAndObjects;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Рома";
        person1.age = 50;
        //System.out.println("Меня зовут "+ person1.name+ " и мне "+ person1.age);
        person1.speak();

        Person person2 = new Person();
        person2.name = "Вова";
        person2.age = 20;
        //System.out.println("Меня зовут "+ person2.name+ " и мне "+ person2.age);
        person2.speak();
        person2.sayHello();


    }

}

class Person {
    //1. Данные (поля)
    //2. Действия (методы)

    String name;
    int age;

    void speak() {
        for (int i=0; i<3; i++){
        System.out.println("Меня зовут "+ name+ " и мне "+ age);}
    }

    void sayHello () {
        //System.out.println("Привет");
    }
}