package Les30_Convert_Data_Types;

public class Test {
    public static void main(String[] args) {
       float f=123.2F;
       long lgn=123423432L;
       int x = (int) lgn; //����� ���������� ������ ���� � �������
        System.out.println(x);

       int a=123;
       long l =a; // ������� ���������� ������ ���� � �������

        int b = 123;
        double db =b;
        System.out.println(db);

        double xc = 123.56;
        int xaz = (int)xc;
        System.out.println(xaz);

        Long las=Math.round(xc);
        System.out.println(las);

        byte bt = (byte)128; //�� -128 �� 127
        System.out.println(bt);

    }
}
