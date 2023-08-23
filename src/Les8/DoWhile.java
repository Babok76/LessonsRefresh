package Les8;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
/*        Scanner sca = new Scanner(System.in);
        System.out.println("Введи 5");
        int val = sca.nextInt();
        while (val != 5) {  // Цикл не выполняется при достижении условия в скобках
            System.out.println("Введи 5");
            val = sca.nextInt();
        }
        System.out.println("Вы ввели 5!");*/

        Scanner sca1 = new Scanner(System.in);
        int val2;
        do {
            System.out.println("Введи 5");
            val2 = sca1.nextInt();
        } while (val2 != 5);
            System.out.println("Вы ввели 5!");


    }
}
