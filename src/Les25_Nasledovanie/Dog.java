package Les25_Nasledovanie;

public class Dog extends Animal {
    public void gav() {
        System.out.println("Gau ! Gau! Gau !");
    }
    public void eat(){
        System.out.println("Dog is eating!");
    }

    public void showName (){
        System.out.println(name);
    }
}
