package Java_Beginner.Les47_Write_To_File_Serialized3_Transient_SerialVersionUID;

import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable {

    @Serial
    private static final long serialVersionUID = 4508864722484643293L; // при изменении структуры класса - поле надо менять
    private int id;
    //   private transient int id;
    private String name; //transient позволяет не сериализовывать какое то поле
    private int age;


    public Person(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return id + " : " + name;
    }

}
