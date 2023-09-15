package Java_Beginner.Les26_Interface;

public class Animal implements Infa {
    public int id;

    public void sleep() {
        System.out.println("I am sleeping");
    }

    public Animal(int id) {
        this.id = id;
    }

    @Override
    public void showInfo() {
        System.out.println("Id is " +this.id);
    }
}
