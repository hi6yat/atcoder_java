package beginnercontest006.fizzbuzz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int N = scanner.nextInt();
            if (N % 3 == 0 || N == 3) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }

}
