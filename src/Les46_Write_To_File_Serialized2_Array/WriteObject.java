package Les46_Write_To_File_Serialized2_Array;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {

        Person[] people = {new Person(1, "Bob44"),
                new Person(2, "Tuk443"), new Person(3, "Tak")};

        try {
            FileOutputStream fos = new FileOutputStream("people2.bin"); // ������� ����� ������ ������
            ObjectOutputStream obs = new ObjectOutputStream(fos); // ���������� �������-����� � ����

            ////////1-�� ������ ������
/*            obs.writeInt(people.length); //����� � ���� ����� ��������� � �������

            for (Person person : people)  //���������� �� �������� � ����� ������ �������
                obs.writeObject(person);*/

            //////2-�� ������ ������
            obs.writeObject(people);

            obs.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
