package LecturePractice.Day_0818.example02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println(fruits);

        // 인덱스를 통한 접근
        String firstFruit = fruits.get(0);
        System.out.println(firstFruit);
        String secondFruit = fruits.get(1);
        System.out.println(secondFruit);
        String thirdFruit = fruits.get(2);
        System.out.println(thirdFruit);

        //요소 삭제
        fruits.remove(1);
        System.out.println(fruits);

        //개수 확인
        System.out.println(fruits.size());

        //전체 제거
        fruits.clear();
        System.out.println(fruits);





    }
}
