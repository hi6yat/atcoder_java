package beginnercontest001.rainsensor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int N = scanner.nextInt();
            List<String> list = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                list.add(scanner.next());
            }
            list.stream().forEach(System.out::println);
            //時刻を丸める
            

            //連続した雨の集約
            //HHMM-HHMM
        }
    }
}
