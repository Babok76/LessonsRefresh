package Java_Beginner.Les19_This;

public class Les19_This {
    public static void main(String[] args) {
        Human hm1 = new Human();
        hm1.setName("Boba");
        hm1.setAge(254);
        hm1.getInfo();
    }
}

class Human {
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void getInfo() {
        System.out.println(name + ", " + age);
    }
}