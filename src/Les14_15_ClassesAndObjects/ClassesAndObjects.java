package Les14_15_ClassesAndObjects;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "����";
        person1.age = 50;
        //System.out.println("���� ����� "+ person1.name+ " � ��� "+ person1.age);
        person1.speak();

        Person person2 = new Person();
        person2.name = "����";
        person2.age = 20;
        //System.out.println("���� ����� "+ person2.name+ " � ��� "+ person2.age);
        person2.speak();
        person2.sayHello();


    }

}

class Person {
    //1. ������ (����)
    //2. �������� (������)

    String name;
    int age;

    void speak() {
        for (int i=0; i<3; i++){
        System.out.println("���� ����� "+ name+ " � ��� "+ age);}
    }

    void sayHello () {
        //System.out.println("������");
    }
}