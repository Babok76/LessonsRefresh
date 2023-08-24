package Les23_StringBuilder;

public class Les23_StringBuilder {
    public static void main(String[] args) {

/*        String x = "Hello";
        //String xa = new String("Hellow");
        x=x.toUpperCase();
        System.out.println(x);*/

/*
        String string1 = "Hello";
        String string2 = "Friend";
        String string3 = " my ";
        String all = string1 + string3 + string2;
        System.out.println(all);
*/
        StringBuilder sb = new StringBuilder("Helll");
        System.out.println(sb.toString());
        //sb.append(" my ");
        //sb.append("friend");
        sb.append(" my ").append("friend");
        System.out.println(sb.toString());

        System.out.printf("This is a string, %s \n", "NICE");
        System.out.printf("This is a string, %-10d\n", 5);
        System.out.printf("%.2f Thii%ss, %-10d\n", 10.4, " ttt ", 10);
        System.out.printf("This is a string, %10d\n", 345);
        //%-[10][.2]
    }
}
