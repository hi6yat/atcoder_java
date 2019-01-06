package beginnercontest004.marble;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int R = scanner.nextInt();
            int G = scanner.nextInt();
            int B = scanner.nextInt();

            System.out.println(calc(R) + calc(G) + calc(B));
        }
    }

    private static int calc(int number) {
        int half = number / 2;
        int result = calcSum(half);
        return number % 2 == 0 ? result -= half : result;
    }

    private static int calcSum(int i) {
        int sum = 0;
        for (int j = i; j > 0; j--) {
            sum += j;
        }
        return sum * 2;

    }

}
