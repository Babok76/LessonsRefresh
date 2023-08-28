package Les28_Modificators;

import Les28_Modificators.Packet1.Person;

public class Les28_Test { //класс не может быть приватным/private или protected
    public int id;
    protected int id2; // доступен если наследуется от класса

    public static void main(String[] args) {
        //public, везде доступ открыт
        // private, везде доступ закрыт
        // default (доступно в пределах папки/packege),
        // protected (доступно в пределах папки/packege и в подклассах вне пакета)

        Person pers1 = new Person();
        //pers1.name = "bob";
        System.out.println(pers1.bax);
        //System.out.println(pers1.name1);
    }
}

