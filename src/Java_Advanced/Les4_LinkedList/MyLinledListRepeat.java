package Java_Advanced.Les4_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MyLinledListRepeat {
    private Node head;
    private int sizeRepeat;


    public void add(int nodeValue) {
        if (head == null) {
            this.head = new Node(nodeValue);
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node(nodeValue));
        }
        sizeRepeat++;
    }

    public int get(int indexValue) {
        int currentIndex = 0;
        Node temp = head;
        while (temp != null) {
            if ((currentIndex) == indexValue) {
                return temp.getNodeValue();

            } else {
                temp = temp.getNext();
                currentIndex++;
            }
        }
        throw new IllegalArgumentException();
    }

    public void remove(int indexRemove) {
        if (indexRemove == 0) {
            head = head.getNext();
            sizeRepeat--;
            return;
        }

        int currentIndex = 0;
        Node temp = head;
        while (temp != null) {
            if (currentIndex + 1 == indexRemove) {
                temp.setNext(temp.getNext().getNext());
                sizeRepeat--;
                return;

            } else {
                temp = temp.getNext();
                currentIndex++;
            }
        }
        throw new IllegalArgumentException();
    }

    public String toString() {
        int[] result = new int[sizeRepeat];
        int indx = 0;
        Node temp = head;
        while (temp != null) {
            result[indx] = temp.getNodeValue();
            indx++;
            temp = temp.getNext();
        }
        return Arrays.toString(result);
    }

    private static class Node {
        private int nodeValue;
        private Node next;

        public Node(int nodeValue) {
            this.nodeValue = nodeValue;
        }

        public int getNodeValue() {
            return nodeValue;
        }

        public void setNodeValue(int nodeValue) {
            this.nodeValue = nodeValue;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
