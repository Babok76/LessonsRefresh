package Java_Beginner.Les43_Vlogenie_Class;

public class Electrocar {
    private int id;
    private static int tst;

    ////////1. Не статический вложенный класс (относятся к полям объекта)
    private class Motor{ //часть машины
        public void startMotor(){
            System.out.println("Motor "+id+ " is starting");
        }

    }
    ///////2. Статический вложенный класс. Группировка двух классов
    public static class Battery{ // логическая группировка с машиной, но по сути - нет
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
        /////// 3. Класс вложенный в метод
        class SomeClass{
            public void someMethod (){
                System.out.println(x);
                System.out.println(id);
            }
        }

        System.out.println("Electrocar "+id+ " is starting...");
    }
}
