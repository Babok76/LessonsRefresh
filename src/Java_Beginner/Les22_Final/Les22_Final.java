package Java_Beginner.Les22_Final;

public class Les22_Final {
    public static void main(String[] args) {
        final int X = 10;
        System.out.println(X);
    }
}

class Test {
    public static final int CONSTANT = 0; //сеттеры для констант нельзя создать


/*    public Test (int CONSTANT) {
        this.CONSTANT = CONSTANT;
    }*/
/*    public void setCONSTANT (int x) {
        this.CONSTANT = x;
    }*/
}