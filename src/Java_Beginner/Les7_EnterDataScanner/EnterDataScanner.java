package Java_Beginner.Les7_EnterDataScanner;

import java.util.Scanner;

public class EnterDataScanner {
    public static void main(String[] args) {
        String sd = "sdfsd";
        String sa = new String("dfrt");
        System.out.println(sa);

        Scanner s = new Scanner(System.in);
        System.out.println("Введите ");

        String str = s.nextLine();
        int x = s.nextInt();

        System.out.println("Вы ввели " + str);
        System.out.println("Число " + x);
    }
}
