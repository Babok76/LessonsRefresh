package Java_Beginner.Les39_Exception3;

public class Exception3 {        //Uncheked (Runtime exception)
    public static void main(String[] args) {
        //Checked  - исключения (compile time exception) = исключительные случаи
        //Uncheked (Runtime exception) = ошибка в работе программы

        // int a = 1/0; - Пример
/*        String name = null;
        name.length();*/

        try {
            int[] arr = new int[2];
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("qweqwe");
        }


    }
}
