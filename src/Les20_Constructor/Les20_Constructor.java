package Les20_Constructor;

import java.util.Scanner;

public class Les20_Constructor {
    public static void main(String[] args) {
        Human h1 = new Human("ddd",34);
/*        Scanner s = new Scanner(System.in);
        System.out.println("������� ��� ");
        String str = s.nextLine();

        Scanner x = new Scanner(System.in);
        System.out.println("������� ������� ");
        int strInt = x.nextInt();

        h1.setName(str);
        h1.setAge(strInt);*/
        h1.calculateAge();
    }
}

class Human {

    private String name;
    private int age;

    public Human() { //�����������1
        System.out.println("������ �� 1-��� ������������");
        this.name = "��� �� ���������";
        this.age = 0;
    }

    public Human(String name, int age) { //�����������2
        System.out.println("������ �� 2-��� ������������");
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
        System.out.println("�� ������ ��������: " + difYears);
        ;
    }
}
