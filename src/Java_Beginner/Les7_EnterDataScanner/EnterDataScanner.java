package Java_Beginner.Les7_EnterDataScanner;

import java.util.Scanner;

public class EnterDataScanner {
    public static void main(String[] args) {
        String sd = "sdfsd";
        String sa = new String("dfrt");
        System.out.println(sa);

        Scanner s = new Scanner(System.in);
        System.out.println("������� ");

        String str = s.nextLine();
        int x = s.nextInt();

        System.out.println("�� ����� " + str);
        System.out.println("����� " + x);
    }
}
