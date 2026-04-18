package Java_Ad2.Less1_ArrayList;

import java.util.Scanner;

public class SimpleNumber {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Введите число");
        int x = s.nextInt();
        System.out.println("Число " + x);

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(x); i++) {

            System.out.println(Math.sqrt(x));
            if (x % i == 0) { // вычисляет остаток деления одного числа на другое

                isPrime = false;
                break;
            }
        }
        System.out.println(x + " является простым числом: " + isPrime);
    }
}


