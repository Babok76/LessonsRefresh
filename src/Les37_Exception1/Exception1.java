package Les37_Exception1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
/*        File file = new File("123");

        try {
            Scanner scan = new Scanner(file);
            System.out.println("�� ����� catch"); //������ �� ����� �����������, ���� ��������� ����������
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            System.out.println("���� �� ������");
        }
        System.out.println("��� ������ �����������");
    }*/
        try {
            readFile();
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            System.out.println("��������� � main");
        }
    }
    public static void readFile() throws FileNotFoundException{
            File file = new File("123");
            Scanner scan = new Scanner(file);
    }
}
