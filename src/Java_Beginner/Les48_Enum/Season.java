package Java_Beginner.Les48_Enum;

public enum Season {
    WINTER(-35), SUMMER(35), AUTUMN(5), SPRING(10);
    private int temp;

    Season(int temp) {
        this.temp = temp;
    }
    public int getTemp () {
        return temp;
    }
}
