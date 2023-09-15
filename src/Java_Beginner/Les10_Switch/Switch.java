package Java_Beginner.Les10_Switch;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите возраст:");
        /*int age = sc.nextInt();
        switch (age){
            case 0:
                System.out.println("Ты родился");
                break;
            case 7:
                System.out.println("Ты пошел в школу");
                break;
            case 18:
                System.out.println("Ты закончил школу");
                break;
            default:
            System.out.println("Ничего");

        }
*/
        String age = sc.nextLine();
        switch (age){
            case "Ноль":
                System.out.println("Ты родился");
                break;
            case "Семь":
                System.out.println("Ты пошел в школу");
                break;
            case "Восемнадцать":
                System.out.println("Ты закончил школу");
                break;
            default:
                System.out.println("Ничего");

        }
    }
}
