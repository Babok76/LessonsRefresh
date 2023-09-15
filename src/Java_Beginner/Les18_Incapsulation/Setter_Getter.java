package Java_Beginner.Les18_Incapsulation;

public class Setter_Getter {
    public static void main(String[] args) {
        Person ps1 = new Person();
        ps1.setName("");
        ps1.setAge(-1);
        //ps1.speak();
        System.out.println("Выводим значение в MAIN " + ps1.getName() + " и возраст " + ps1.getAge());
    }
}

class Person {
    private String name;
    private int age;

    public void setName(String username) {
        if (username.isEmpty()){
            System.out.println("Ты ввел пустое имя");
        } else {
        this.name = username;}
    }

    public String getName() {
        return name;
    }

    public void setAge(int userage) {
        if (userage<0){
            System.out.println("Возраст не может быть меньше нуля");
        } else {
        this.age = userage;}
    }

    public int getAge() {
        return age;
    }

    int calculateAge() {
        int oldYears = 60 - age;
        //System.out.println(oldYears);
        return oldYears;
    }

    void speak() { //метод - void = "Пустота", "Ничто"
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + " и мне " + age);
        }
    }

    void sayHello() { //метод - void = "Пустота", "Ничто"
        System.out.println("Привет");
    }
}