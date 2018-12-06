package beginnerselection.practice_a;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in);) {
            IntStream.Builder builder = IntStream.builder();
            for (int i = 0; i < 3; i++) {
                builder.add(scanner.nextInt());
            }
            IntStream iStream = builder.build();
            System.out.println(iStream.sum() + " " + scanner.next());
        }
    }
}
