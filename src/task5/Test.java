package task5;

import task3.DynamicArray;
import task3.Student;
import task4.MyDoublyLinkedList;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("George","Huron",80);
        Student s2 = new Student("Mike","Kean",10);
        Student s3 = new Student("Melanie","Carlson",26);
        Student s4 = new Student("Karim","Benzema",28);

        DynamicArray dynamicArray =new DynamicArray();
        dynamicArray.addElement(s1);
        dynamicArray.addElement(s2);
        dynamicArray.addElement(s3);
        dynamicArray.addElement(s4);

        MyDoublyLinkedList linkedList = new MyDoublyLinkedList();
        linkedList.push(s1);
        linkedList.push(s2);
        linkedList.push(s3);
        linkedList.push(s4);
        for (Student s: dynamicArray.getStudents()) {
            System.out.println(s.getFirstName() + " " + s.getLastName());
        }
        linkedList.getElementIndex(s1);
        linkedList.getElementIndex(s2);
        linkedList.getElementIndex(s3);
        linkedList.getElementIndex(s4);

    }
}
