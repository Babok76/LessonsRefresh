package Les49_Recursia;

public class Test {
    public static void main(String[] args) {
        ////�������� - ����� ������ � ���� ����� �� ������
        someMethod();

    }

    private static void someMethod() {
        System.out.println("Hello !");
         // ��������� base case ������� ������ �� ������
        someMethod();  // ����������� ����� ������

    }
}
