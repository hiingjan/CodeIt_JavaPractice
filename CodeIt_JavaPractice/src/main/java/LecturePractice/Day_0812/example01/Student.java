package LecturePractice.Day_0812.example01;

public class Student {
    String name;
    int mathScore;
    int engScore;

    Student(String name, int mathScore, int engScore){
        this.name = name;
        this.mathScore = mathScore;
        this.engScore = engScore;
    }

    double getAverage(){
        return (mathScore + engScore) / 2.0;
    }


}
