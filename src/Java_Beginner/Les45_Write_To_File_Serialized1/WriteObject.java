package Java_Beginner.Les45_Write_To_File_Serialized1;

import java.io.*;

public class WriteObject {
    public static void main(String[] args) {
        Person pers1 = new Person(1, "Bob");
        Person pers2 = new Person (2, "Tuk");

        try {
            FileOutputStream fos = new FileOutputStream("people.bin"); // ������� ����� ������ ������
            ObjectOutputStream obs = new ObjectOutputStream(fos); // ���������� �������-����� � ����

            obs.writeObject(pers1);
            obs.writeObject(pers2);

            obs.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
