package Les4;

public class WhileLoops {
    public static void main(String[] args) {
        boolean ta = 5 < 2;
        boolean ts = 5 >= 5;
        boolean t = 5 == 5;
        System.out.println(t);

        int value = 0;
        boolean td = value > 5;
        System.out.println(td);

        while (value<7) {
            System.out.println("Привет Мир " + value);
            value=value+1;
        }

    }
}
