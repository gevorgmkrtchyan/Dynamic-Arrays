package task1.task2;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    String firstName;
    private String lastName;
    int age;

    Student(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return this.lastName.compareTo(student.lastName);
    }
}

class SortByFirstName implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2) {
        return s1.firstName.compareTo(s2.firstName);
    }
}

class SortByAge implements Comparator<Student>{
    @Override
    //reverse order
    public int compare(Student s1, Student s2) {
        return s2.age - s1.age;
    }

}
