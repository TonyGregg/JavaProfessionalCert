package jvm;

/**
 * Created by anton on 6/23/2018 11:07 AM
 **/
public class EligibleObjectDemo {

    public static void main(String[] args) {
        Student[] students = {new Student("Antony",23), new Student("Steffi",20), new Student("Jotham",7)};
        removeLast(students);
        Student student = students[0];

        students[0].setName("Some. .. ");
        students[0] = null;

        System.out.println(student.getName()+ " "+student.getAge());

    }
    private static void removeLast(Student[] students) {
        students[students.length-1] = null;
    }
}

class Student {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
