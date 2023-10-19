package Java_Advanced.Les3_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
/*        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.get(0);
        linkedList.size();
        linkedList.remove(0);*/

        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        // [1][2][3][4]  - ������� ����������� � ����� ������� ��� ArrayList ��� add(i), � ������� get �������������� ����� ������
        // [5][1][2][3][4]  - ������� ����������� � ������ ������� ��� ArrayList add(0,i), ��� �������� ���������� ������ �� ������
        // [1]->[2]->[3] - ��� LinkedList get ���� �� ���� ��������� (�� ������� �����, ����+������ �� ��������� ����)
        // head-> [5] -> [1]->[2]->[3] ��� LinkedList, ��� add ��������� ������� head � ������, � ��������� ���� ����, � �� ������ �������
        // ���������� � ���������� � ����� ����� - ������� ������� ��� ArrayList
        // �������� ��������� ��� ���������� � ������ ����� - ������� ���  LinkedList

        measureTimeAdd1(arrayList);
        measureTimeAdd2(linkedList);

    }

    private static void measureTimeAdd2(List<Integer> list) {
/*        for (int i = 0; i < 100000; i++) {
            list.add(i); //�������� ����������� � ����� �������
        }*/
        long start = System.currentTimeMillis(); // ���������� ������� ����� � ������������
/*        for (int i = 0; i < 100000; i++) {
            list.get(i);
        }*/
        for (int i =0; i<100000; i++){
            list.add(0,i); //�������� ����������� � ������� 0

        }
        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }

    private static void measureTimeAdd1(List<Integer> list) {
/*        for (int i = 0; i < 100000; i++) {
            list.add(i); //�������� ����������� � ����� �������
        }*/
        long start = System.currentTimeMillis(); // ���������� ������� ����� � ������������
/*        for (int i = 0; i < 100000; i++) {
            list.get(i);
        }*/
        for (int i =0; i<100000; i++){
            list.add(i);

        }
        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }

}
