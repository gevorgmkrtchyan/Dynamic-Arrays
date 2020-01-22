package task4;

import java.util.Arrays;
import task3.Student;

class Node{
    Object data;
    Node next;
    Node previous;

    public void displayNodeData() {
        System.out.println(data);
    }
}

public class MyDoublyLinkedList {
    private Node head;
    private Node tail;
    int size;

    public void push(Student data){
        Node node = new Node();
        node.data = data;
        node.next = head;
        node.previous = null;
        if(head != null){
            head.previous = node;
        }
        head = node;
        if(tail == null){
            tail = node;
        }
        size++;
    }

    public void printLinkedList() {
        System.out.println("Doubly LinkedList capacity is show below" + "\n");
        Node current = head;
        while (current != null) {
            current.displayNodeData();
            current = current.next;
        }
        System.out.println();
    }

    public Node pop(){
        Node removedData = head;
        head = head.next;
        head.previous = null;
        size--;
        System.out.print("Were removed teh first object: ");
        return removedData;
    }
    public boolean addLast(Student st){
        Node node = new Node();
        node.data = st;
        node.next = null;
        node.previous = tail;
        if(tail != null)
            tail.next = node;
        tail = node;
        if(head == null)
            head = node;
        size++;
        System.out.println("Has been added new object: ");
        return true;
    }
    public int getSize(){
        System.out.print("Size: ");
        return size;
    }

    public Node removeLast() {
        Node lastRemoved = tail;
        tail = tail.previous;
        tail.next = null;
        size--;
        System.out.println("Has been removed the last object: ");
        return lastRemoved;
    }
    public void getElementIndex(Student student){
        int index = 1;
        boolean contains = false;
        Node current = head;
        while (current != null) {
            if (current.data == student){
                contains = true;
                break;
            }
            current = current.next;
            index++;
        }
        if (contains){
            System.out.println(index);
        }else System.out.println("INVALID INPUT");
    }
    public static void main(String[] args) {

        //push() --> THIS FUNCTION WILL ADD THE OBJECT AT THE FRONT OF THE LIST
        //pop()  --> THIS FUNCTION WILL REMOVE THE FIRST OBJECT OF THE LIST
        //addLast() --> THIS FUNCTION WILL ADD THE OBJECT AT THE END OF THE LIST
        //printLinkedList() --> THIS FUNCTION WILL PRINT THE LIST OF OBJECTS
        //getSize() --> THIS FUNCTION WILL RETURN THE SIZE OF THE LIST
        //removeLast() --> THIS FUNCTION WILL REMOVE THE LAST OBJECT OF THE LIST
        //getElementIndex() --> THIS FUNCTION WILL PRINT THE INDEX OF THE ELEMENT(IF CONTAINS)

        MyDoublyLinkedList lList = new MyDoublyLinkedList();
        lList.push(new Student("Aram","Aramyan",12));
        lList.push(new Student("Vardan","Vardanyan",17));
        lList.push(new Student("Levon","Levonyan",12));
        lList.printLinkedList();
        System.out.println(lList.pop().data);
        lList.addLast(new Student("AAAA","BBB",180));
        lList.printLinkedList();
        lList.removeLast();
        lList.printLinkedList();
        System.out.println(lList.getSize());
    }
}
