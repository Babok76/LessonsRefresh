package Java_Beginner.Les49_Recursia;

public class Test {
    public static void main(String[] args) {
        ////�������� - ����� ������ � ���� ����� �� ������
        someMethod(5);
        //4! = 4*3*2*1
        //1! = 1
        //15! = 15*14*13...
        //0! = 1
        System.out.println(fact(4));
        //fact(4)
        //4*fact(3)
        //3*fact(2)
        //2*fact(1)
        //fact(1) = return 1;

    }

    private static void someMethod(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        // ��������� base case ������� ������ �� ������
        someMethod(n - 1);  // ����������� ����� ������ //������ ����������� ��� �������� n,
        // ������ ��� ���������� ����� �� ������ - ������ ����� ���� �������, ������ �������� � �����

    }

    private static int fact(int x) {
        if (x==1)
            return 1;
        return x*fact(x-1);
    }
}
