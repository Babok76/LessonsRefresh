package Les48_Enum;

public class Test {
/*    private static final int DOG = 0; ////// Так было раньше
    private static final int CAT = 1;
    private static final int FROG = 2;

    public static void main(String[] args) {

        int animal = DOG;
        switch (animal) {
            case DOG:
                System.out.println("It is a dog");
                break;
            case FROG:
                System.out.println("It is a frog");
                break;
            default:
                System.out.println("It is not animal");
        }
    }*/

    public static void main(String[] args) {
        Animal animal = Animal.CAT;
        switch (animal) {
            case DOG:
                System.out.println("It is a dog");
                break;
            case FROG:
                System.out.println("It is a frog");
                break;
            default:
                System.out.println("It is not animal");
        }
        Season season = Season.SUMMER;

        switch (season) {
            case SUMMER:
                System.out.println("It is a SUMMER");
                break;
            case WINTER:
                System.out.println("It is a SUMMER");
                break;
            default:
                System.out.println("It is not a season");
        }
    }
}
