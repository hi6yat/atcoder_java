package beginnercontest001.visibility;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double m = scanner.nextInt();
            String vv ;
            // m -> kmに変換
            double km = m / 1000;
            if (0.1 <= km && km < 1.0) {
                vv = String.valueOf(km).replaceAll("\\.", "").substring(0, 2);
            } else if (km <= 5.0) {
                vv = String.valueOf(km * 10).replaceAll("\\.", "").substring(0, 2);
            } else if (6.0 <= km && km <= 30) {
                vv = String.valueOf(km + 50).replaceAll("\\.", "").substring(0, 2);
            } else if (35 <= km && km <= 70) {
                vv = String.valueOf((km - 30) / 5 + 80).replaceAll("\\.", "").substring(0, 2);
            } else if (km > 70) {
                vv = "89";
            } else {
                vv = "00";
            }

            System.out.println(vv);

        }
    }

}
