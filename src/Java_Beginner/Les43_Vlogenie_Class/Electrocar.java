package Java_Beginner.Les43_Vlogenie_Class;

public class Electrocar {
    private int id;
    private static int tst;

    ////////1. �� ����������� ��������� ����� (��������� � ����� �������)
    private class Motor{ //����� ������
        public void startMotor(){
            System.out.println("Motor "+id+ " is starting");
        }

    }
    ///////2. ����������� ��������� �����. ����������� ���� �������
    public static class Battery{ // ���������� ����������� � �������, �� �� ���� - ���
        public void charge(){
            System.out.println("Battery is charging"+tst);
        }
    }


    public Electrocar (int id){
        this.id=id;
    }
    public void start(){
        Motor motor1 = new Motor();
        motor1.startMotor();
        final int x=1;
        /////// 3. ����� ��������� � �����
        class SomeClass{
            public void someMethod (){
                System.out.println(x);
                System.out.println(id);
            }
        }

        System.out.println("Electrocar "+id+ " is starting...");
    }
}
