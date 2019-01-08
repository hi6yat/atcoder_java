package beginnercontest003.salary;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numberOfTask = scanner.nextInt();
            System.out.println(
                    (int) IntStream.rangeClosed(1, numberOfTask).mapToDouble(i -> (i * 10000) * (1.0 / numberOfTask))
                            .sum());
        }
    }

}