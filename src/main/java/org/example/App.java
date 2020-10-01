package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<String> dict = new ArrayList<>();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите фразу или end, если хотите выйти");
            String str = scanner.nextLine();

            if (str.equals("end"))
                break;

            Function<String, List<String>> converter =
                    input -> Arrays.stream(input.split(" "))
                            .collect(Collectors.toList());

            dict.addAll(converter.apply(str));
            dict.stream()
                    .sorted()
                    .forEach(System.out::println);
        }
    }
}
