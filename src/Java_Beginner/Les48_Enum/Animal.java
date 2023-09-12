package Java_Beginner.Les48_Enum;

public enum Animal {
    DOG("������"), FROG("�������"), CAT ("�����");

    private String trans;

    Animal(String trans) {
        this.trans = trans;
    }

    public String getTrans(){
        return trans;
    }

    @Override
    public String toString() {
        return "������� �� ������� ���� " + trans;
    }
}
