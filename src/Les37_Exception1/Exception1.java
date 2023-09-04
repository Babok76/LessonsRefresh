package Les37_Exception1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
/*        File file = new File("123");

        try {
            Scanner scan = new Scanner(file);
            System.out.println("До блока catch"); //строка не будет выполняться, если сработало Исключение
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            System.out.println("Файл не найден");
        }
        System.out.println("Код дальше выполняется");
    }*/
        try {
            readFile();
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            System.out.println("Обработка в main");
        }
    }
    public static void readFile() throws FileNotFoundException{
            File file = new File("123");
            Scanner scan = new Scanner(file);
    }
}
