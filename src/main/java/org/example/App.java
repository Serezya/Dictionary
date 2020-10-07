package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите фразу или end, если хотите выйти");
            String str = scanner.nextLine();

            if (str.equals("end"))
                break;

            Function<String, List<String>> converter =
                    input -> Arrays.stream(input.split(" "))
                            .collect(Collectors.toList());

            printDict(converter, str);
        }
    }

    private static void printDict(Function<String, List<String>> converter, String str) {
        converter.apply(str).stream()
                .sorted()
                .forEach(System.out::println);
    }
}
