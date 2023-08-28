package Les26_Interface;

public class Les26_Interface {
    public static void main(String[] args) {

        Animal animal1 = new Animal(13);
        Person pers1 = new Person("bob");
/*        animal1.sleep();
        pers1.sayHello();*/
/*        animal1.showInfo();
        pers1.showInfo();*/
        Infa info1= new Animal(1);
        Infa info2 = new Person("Bobff");
/*
        info1.showInfo();
        info2.showInfo();*/

        output(info1);
        output(info2);

        output(animal1);
        output(pers1);

    }
    public static void output(Infa inf1){
        inf1.showInfo();

    }
}
