package Java_Beginner.Les40_Exception4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Exception4 { // ����� ����� ���������� ��������� ������ ����������
    public static void main(String[] args) {
/////////////////1 �������
        /*        try {
            run();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e){
            e.printStackTrace();
        }*/
        ////////////////2 �������
/*        try {
    run();
        } catch (IOException | ParseException e) { //������ Catch
            e.printStackTrace();
        }*/

    //////////////////3 �������
            try {
        run();
    } catch (Exception e) {

    }
}

    public static void run() throws IOException, FileNotFoundException, ParseException, IllegalArgumentException {

    }
}
