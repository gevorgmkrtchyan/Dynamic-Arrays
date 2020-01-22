package task3;

import java.util.Arrays;

public class DynamicArray {
    private int size;
    private Student[] students;
    public DynamicArray(){
        size = 0;
        students = new Student[size];
    }

    public Student[] getStudents() {
        return students;
    }

    public Student getElementByIndex(int index){
        return students[index];
    }

    public boolean addElement(Student student){
        setSize(size + 1);
        students[size++] = student;
        return true;
    }

    public void setSize (int minSize){
        int oldSize = students.length;
        if (minSize > oldSize){
            int newSize = oldSize * 2;
            if (newSize < minSize)
                newSize = minSize;
            students = Arrays.copyOf(students, newSize);

        }
    }
    public int getSize(){
        int size = 0;
        for (int i = 0; i <students.length ; i++) {
            if (students[i] == null){
                size = i;
                break;
            }
        }
        return size;
    }

    public boolean removeElement(Student student){
        for (int i = 0; i <students.length ; i++) {
            if (students[i] == student){
                for (int j = i; j <students.length - 1 ; j++) {
                    students[j] = students[j + 1];
                }
                break;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        DynamicArray dArray = new DynamicArray();
        Student s1 = new Student("John","Johnson",10);
        Student s2 = new Student("Mary","Cameron",19);
        Student s3 = new Student("Sara","Owen",25);
        Student s4 = new Student("Mike","Gwen",16);
        Student s5 = new Student("Antony","Watson",30);
        dArray.addElement(s1);
        dArray.addElement(s2);
        dArray.addElement(s3);
        dArray.addElement(s4);
        dArray.addElement(s5);

        for (Student s: dArray.students) {
            System.out.println(s);
        }
        System.out.println("-----------------------");
        dArray.removeElement(s4);
        for (Student s: dArray.students) {
            System.out.println(s);
        }
        System.out.println("-----------------------");
        System.out.println(dArray.getSize());

    }
}
