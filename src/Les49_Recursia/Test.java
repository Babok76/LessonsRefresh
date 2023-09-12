package Les49_Recursia;

public class Test {
    public static void main(String[] args) {
        ////Рекурсия - вызов метода в теле этого же метода
        someMethod();

    }

    private static void someMethod() {
        System.out.println("Hello !");
         // необходим base case условие выхода из метода
        someMethod();  // Рекурсивный вызов метода

    }
}
