package Java_Beginner.Les39_Exception3;

public class Exception3 {        //Uncheked (Runtime exception)
    public static void main(String[] args) {
        //Checked  - ���������� (compile time exception) = �������������� ������
        //Uncheked (Runtime exception) = ������ � ������ ���������

        // int a = 1/0; - ������
/*        String name = null;
        name.length();*/

        try {
            int[] arr = new int[2];
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("qweqwe");
        }


    }
}
