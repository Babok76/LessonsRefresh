package Java_Advanced.Les1_ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
/*        int[] mass = new int[3];

        for (int i = 0; i < 4; i++) {
            mass[i]=1;
        }*/


        ArrayList<Integer> list = new ArrayList<>();
        List<Integer> arr = new ArrayList<>(); // � ����������� � ����������, ���� ������� ����� �� ��������� (List),
        // ��. ����� ��� ���������

        for (int i = 0; i < 10; i++) {
            list.add(i);       //�������� ������� � ������
        }
        list.remove(5); // �������� ������� �� �������. ���� ����� remove ����� �� ���������� -
        // ��� �������� ����������� ����� �� �������, ����� ������������ linkedList
        System.out.println(list);

        System.out.println(list.get(0));  //�������� ������� �������
        System.out.println(list.get(8));
        System.out.println("");


        System.out.println(list.size());  //�������� ������ �������
        System.out.println("");

        for (int i = 0; i < list.size(); i++) { // ����� ������� � �������
            System.out.println(list.get(i));
        }
        System.out.println("");
        for (Integer x : list) { // ����� ������� � �������
            System.out.println(x);
        }

// �������� ����� �������� �� ������ ����� ����� ������������ LinkedList
        arr = new LinkedList<>();

    }
}
