package Java_Advanced.Les4_LinkedList;

import java.util.Arrays;

public class MyLinkedList { //односвязанный и не параметризованный
    private Node head;
    private int size;

    public void add(int value) {
        //если это первое добавление в список
        if (head == null) {
            // то здесь будет какая то логика
            this.head = new Node(value);
        } else {
            Node temp = head;

            while (temp.getNext() != null) {
                temp = temp.getNext();
                //[1]->[2]->[3]

            }
            temp.setNext (new Node(value));

        }
        size++;
    }

    public String toString (){
        int[] result = new int[size];
        int idx = 0;
        Node temp = head;

        while (temp != null){
            result[idx++]= temp.getValue();
            temp = temp.getNext();

        }
        return Arrays.toString(result);
    }

    private static class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
