package LecturePractice.Day_0818.example06;

import java.sql.SQLOutput;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David");

        System.out.println("스트림 새성 및 중간 연산 정의");
        var stream = names.stream()
                .filter(name -> {
                    System.out.println("filter 호출: " + name);
                    return name.length() > 3;
                });
        System.out.println(("아직 아무것도 실행되지 않음"));

        System.out.println("최종 연산 forEach 시작");
        stream.forEach(name -> System.out.println("결과 출력: " + name));
    }
}