package beginnercontest006.toribonatti;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int N = scanner.nextInt();
            int a1 = 0;
            int a2 = 0;
            int a3 = 1;
            int result = 0;
            //n = 4のとき

            if (N >= 4) {
                int[] intArray = new int[N];
                intArray[0] = 0;
                intArray[1] = 0;
                intArray[2] = 1;
                for (int i = 3; i < N; i++) {
                    intArray[i] = intArray[i - 1] + intArray[i - 2] + intArray[i - 3];
                }
                int target = intArray[N - 1];
                result = target < 10007 ? intArray[N - 1] : intArray[N - 1] % 10007;

            } else {
                switch (N) {
                case 1:
                case 2:
                    break;
                case 3:
                    result = 1;
                    break;
                default:
                    break;
                }
            }
            System.out.println(result);
        }

    }

}
