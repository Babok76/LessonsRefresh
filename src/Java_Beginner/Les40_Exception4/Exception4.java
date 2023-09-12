package Java_Beginner.Les40_Exception4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Exception4 { // метод может выкидывать несколько разных исключений
    public static void main(String[] args) {
/////////////////1 вариант
        /*        try {
            run();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e){
            e.printStackTrace();
        }*/
        ////////////////2 вариант
/*        try {
    run();
        } catch (IOException | ParseException e) { //мульти Catch
            e.printStackTrace();
        }*/

    //////////////////3 вариант
            try {
        run();
    } catch (Exception e) {

    }
}

    public static void run() throws IOException, FileNotFoundException, ParseException, IllegalArgumentException {

    }
}
