package Java_Beginner.Les10_Switch;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������� �������:");
        /*int age = sc.nextInt();
        switch (age){
            case 0:
                System.out.println("�� �������");
                break;
            case 7:
                System.out.println("�� ����� � �����");
                break;
            case 18:
                System.out.println("�� �������� �����");
                break;
            default:
            System.out.println("������");

        }
*/
        String age = sc.nextLine();
        switch (age){
            case "����":
                System.out.println("�� �������");
                break;
            case "����":
                System.out.println("�� ����� � �����");
                break;
            case "������������":
                System.out.println("�� �������� �����");
                break;
            default:
                System.out.println("������");

        }
    }
}
