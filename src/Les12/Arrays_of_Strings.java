package Les12;

public class Arrays_of_Strings {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[1] = 10;
        String[] strings = new String[3];
        strings[1] = "ghbsd";
        //System.out.println(strings[1]);

/*        for (int i=0; i<strings.length; i++){
            System.out.println(strings[i]); }*/

        for (String string1 : strings) {
            System.out.println(string1);
        }
        int[] numbers1 = {1, 2, 3};
        int sum = 0;
        for (int x : numbers1) {
            sum = sum + x;
            System.out.println(x);
        }
        System.out.println(sum);

        int value = 0;
        String s;
    }

}
