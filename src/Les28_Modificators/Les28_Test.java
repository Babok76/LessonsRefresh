package Les28_Modificators;

import Les28_Modificators.Packet1.Person;

public class Les28_Test { //����� �� ����� ���� ���������/private ��� protected
    public int id;
    protected int id2; // �������� ���� ����������� �� ������

    public static void main(String[] args) {
        //public, ����� ������ ������
        // private, ����� ������ ������
        // default (�������� � �������� �����/packege),
        // protected (�������� � �������� �����/packege � � ���������� ��� ������)

        Person pers1 = new Person();
        //pers1.name = "bob";
        System.out.println(pers1.bax);
        //System.out.println(pers1.name1);
    }
}

