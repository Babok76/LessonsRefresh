package Les24_Object_ToString;

public class Les24_Object_ToString {
    public static void main(String[] args) {
        String string = "Hello";
        Human h1 = new Human("dod", 356);
        //h1.toString();
        System.out.println(h1.toString());

    }
}

class Human {
    private String name;
    private int age;

    public Human(String name, int age) { //�����������2
        System.out.println("������ �� 2-��� ������������");
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {  //��������������� ������ toString
        return name+ ", "+ age;
        //return super.toString();
    }
}