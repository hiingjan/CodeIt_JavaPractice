package LecturePractice.Day_0818.Project1;

import javax.naming.InvalidNameException;

public class Student {
    private String name;
    private int age;
    private String studentId;

    public  Student(String name, int age, String studentId){
        this.name = name;
        this.age = age;
        this.studentId = studentId;

    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        return  "Student{name='" + name + "', age=" + age + ", studentId='" + studentId + "'}";
    }
}
