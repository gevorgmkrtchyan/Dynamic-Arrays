package task1.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", "Doe", 45));
        students.add(new Student("Amanda", "Clark",25));
        students.add(new Student("Karen", "Duck",38));
        students.add(new Student("Jack", "Morgan",18));

        students.sort(new SortByFirstName());
        System.out.println("Sorted by first name" + "\n");
        for (Student s : students) {
            System.out.println(s);
        }
        Collections.sort(students,new SortByAge());
        System.out.println("Reverse order by age" + "\n");
        for (int i = 0; i <students.size() ; i++) {
            System.out.println(students.get(i));
        }
        students = new LinkedList<>(students);
        Collections.sort(students);
        System.out.println("Sorted by last name");
        for (int i = 0; i <students.size(); i++) {
            System.out.println(students.get(i));
        }
    }
}

