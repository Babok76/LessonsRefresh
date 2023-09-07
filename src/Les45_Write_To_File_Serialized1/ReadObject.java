package Les45_Write_To_File_Serialized1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person pers1 = (Person) ois.readObject();
            Person pers2 = (Person) ois.readObject();

            System.out.println(pers1);
            System.out.println(pers2);

            ois.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
