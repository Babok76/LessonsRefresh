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
        System.out.println(animal.getTrans());
        System.out.println(animal.toString());
        System.out.println(animal);
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
        System.out.println(season instanceof Enum);
        System.out.println(season.getClass());
        System.out.println(animal.getClass());
        System.out.println(season.getTemp());

        // Object->Enum->Season

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
        System.out.println(season.name());
        System.out.println(animal.name());

        Animal frog = Animal.valueOf("FROG");
        System.out.println(frog.getTrans());

        System.out.println(season.ordinal());  //////////Индекс под которым стоит значение ENUM

    }
}
