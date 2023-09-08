package Les47_Write_To_File_Serialized3_Transient_SerialVersionUID;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people2.bin"))) { // close ��������� �� ����� "tryWithResourses"
/*            FileInputStream fis = new FileInputStream("people2.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);*/
/////1-�� ������ ������
/*            int personCount = ois.readInt(); //��������� ���-�� ��������� � �������
            Person[] people = new Person [personCount];

            for (int i=0; i< personCount; i++){
                people[i] = (Person) ois.readObject();
            }*/
//////2-�� ������ ������
            Person[] people = (Person[]) ois.readObject();

            System.out.println(Arrays.toString(people));
            //ois.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
