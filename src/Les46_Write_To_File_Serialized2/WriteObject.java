package Les46_Write_To_File_Serialized2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person pers1 = new Person(1, "Bob44");
        Person pers2 = new Person(2, "Tuk443");

        try {
            FileOutputStream fos = new FileOutputStream("people2.bin"); // создает поток данных байтов
            ObjectOutputStream obs = new ObjectOutputStream(fos); // записывает объекты-байты в файл

            obs.writeObject(pers1);
            obs.writeObject(pers2);

            obs.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
