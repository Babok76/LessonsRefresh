package Java_Beginner.Les26_Interface;

public class Person implements Infa {
    public String name;

    public void sayHello(){
        System.out.println("Hello");
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void showInfo() {
        System.out.println("Name is "+ this.name);
    }
}
