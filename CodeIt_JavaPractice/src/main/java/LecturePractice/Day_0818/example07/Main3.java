package LecturePractice.Day_0818.example07;

import java.util.Arrays;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // 출력
        names.forEach(System.out::println);

        // 길이 5 이상
        names.stream()
                .filter(s -> s.length() >= 5)
                .forEach(System.out::println);

        // 대문자 변환
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}


