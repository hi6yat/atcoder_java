package beginnercontest002.honest;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            BigDecimal x = scanner.nextBigDecimal();
            BigDecimal y = scanner.nextBigDecimal();
            System.out.println(x.compareTo(y) > 0 ? x : y);

        }

    }

}
