package Les46_Write_To_File_Serialized2_Array;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {

        Person[] people = {new Person(1, "Bob44"),
                new Person(2, "Tuk443"), new Person(3, "Tak")};

        try {
            FileOutputStream fos = new FileOutputStream("people2.bin"); // создает поток данных байтов
            ObjectOutputStream obs = new ObjectOutputStream(fos); // записывает объекты-байты в файл

            ////////1-ый способ записи
/*            obs.writeInt(people.length); //пишем в файл число элементов в массиве

            for (Person person : people)  //проходимся по массивам и пишем каждый элемент
                obs.writeObject(person);*/

            //////2-ой способ записи
            obs.writeObject(people);

            obs.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
