package beginnercontest004.circle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    private static final String BLANK = " ";
    static List<List<String>> argsList = new ArrayList<>();

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < 4; i++) {
                List<String> list = Arrays.asList(scanner.nextLine().split(BLANK));
                Collections.reverse(list);
                argsList.add(list);
            }
            Collections.reverse(argsList);
            argsList.forEach(list -> {
                String ssString = list.stream().collect(Collectors.joining(BLANK));
                System.out.println(ssString);
            });
        }
    }

}
