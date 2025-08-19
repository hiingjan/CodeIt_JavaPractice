package LecturePractice.Day_0818.example05;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Jerry", "Kim", "Tommy");

        names.stream()
                .filter(name -> name.startsWith("T"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
