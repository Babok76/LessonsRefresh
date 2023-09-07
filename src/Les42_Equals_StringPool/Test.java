package Les42_Equals_StringPool;

public class Test {
    public static void main(String[] args) {
 /*       int x = 1;
        int y = 1;
        System.out.println(x==y);*/  //��������� ����������
        Animal anim1 = new Animal(1);
        Animal anim2 = new Animal(1);
        System.out.println(anim1 == anim2); // ��������� ��������, ����������, ��� �� ����� ��������
        System.out.println(anim1.equals(anim2)); // ��������� �������� �������� ������ ����� equal

/*        Object obj1 = new Object();
        obj1.equals();*/

        Animal anim3 = anim1;
        System.out.println( anim3 == anim1); // ��� ��������� ������ �� ������ �������� �����

        ////////////��������� ����� // �������� ����� equal, ��� ��� ������ ���������� � pool
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println("������: "+ str1.equals(str2)); //��� ���������
        System.out.println(str1 == str2); // ��� �� ������ ��������

        ////////��������� �����, ����� pool �������� �� �����
        String str3 = new String("h1");
        String str4 = new String("h1");
        System.out.println(str3 == str4);

        ///////������, ����� == �������� �� �����
        String a = "h2";
        String b = "h23434".substring(0,2);
        System.out.println(a==b);

    }
}

class Animal {
    private int id;

    public Animal(int id) {
        this.id = id;

    }

    public boolean equals(Object obj) {
        Animal otherAn = (Animal) obj;
        return this.id ==otherAn.id;
    }
}