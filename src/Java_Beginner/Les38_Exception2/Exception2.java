package Java_Beginner.Les38_Exception2;

import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) throws ScannerException {
        Scanner scan = new Scanner(System.in);
        while (true){
            int x = Integer.parseInt(scan.nextLine());

            if (x!=0){
/*                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("�� ����!");
                }*/
                throw new ScannerException("����� ����� ����");
            }
        }
    }
}
