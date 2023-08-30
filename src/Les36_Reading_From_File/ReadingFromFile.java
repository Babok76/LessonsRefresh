package Les36_Reading_From_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
/*        Scanner scan1 = new Scanner(System.in);
        String value = scan1.nextLine();*/

        /////1. ������� ������ ������ File
        String separator = File.separator;
        String path = separator + "Users" + separator + "Ser" + separator + "Desktop" + separator + "TestForJava.txt";
        System.out.println(path);
        File file1 = new File(path);

        /////2. ������ �� ���� ��������� ����
        Scanner scan1 = new Scanner(file1);

        /////3. ������� �� ����� ������
        while (scan1.hasNextLine()) {
            System.out.println(scan1.nextLine());
        }

        /////4. ����������� ��������� �����
        scan1.close();
    }
}
