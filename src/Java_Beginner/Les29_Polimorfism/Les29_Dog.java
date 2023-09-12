package Java_Beginner.Les29_Polimorfism;

public class Les29_Dog extends Les29_Animal{
    public void Gauu (){
        System.out.println("Gau! Gau Gau");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating...");
    }
}
