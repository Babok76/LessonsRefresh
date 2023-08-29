package Les30_Convert_Data_Types;

public class Test {
    public static void main(String[] args) {
       float f=123.2F;
       long lgn=123423432L;
       int x = (int) lgn; //явное приведение одного типа к другому
        System.out.println(x);

       int a=123;
       long l =a; // неявное приведение одного типа к другому

        int b = 123;
        double db =b;
        System.out.println(db);

        double xc = 123.56;
        int xaz = (int)xc;
        System.out.println(xaz);

        Long las=Math.round(xc);
        System.out.println(las);

        byte bt = (byte)128; //от -128 до 127
        System.out.println(bt);

    }
}
