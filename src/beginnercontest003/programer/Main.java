package beginnercontest003.programer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int N = scanner.nextInt();
            int K = scanner.nextInt();

            List<Integer> rateList = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                rateList.add(scanner.nextInt());
            }
            Collections.sort(rateList, Comparator.reverseOrder());
            List<Integer> newRateList = new ArrayList<>(rateList.subList(0, K));
            double rate = 0;
            Collections.sort(newRateList, Comparator.naturalOrder());
            for (Integer i : newRateList) {
                rate += i;
                rate /= 2.0;
            }
            System.out.println(rate);
        }
    }

}
