package beginnercontest001.windobservation;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int deg = scanner.nextInt();
            int dis = scanner.nextInt();

            double deg_double = deg / 10.0;
            BigDecimal dis_bd = new BigDecimal(dis);
            BigDecimal divide = dis_bd.divide(new BigDecimal(60), 1, BigDecimal.ROUND_HALF_UP);
            String direction = "N";
            int windPower = 0;

            for (Directions direc : Directions.values()) {
                if (direc.getMin() <= deg_double && deg_double < direc.getMax()) {
                    direction = direc.name();
                    break;
                }
            }

            WindPower[] wpArray = WindPower.values();
            for (int j = 0; j < wpArray.length; j++) {
                if (wpArray[j].getFrom() <= divide.doubleValue() && divide.doubleValue() <= wpArray[j].getTo()) {
                    windPower = j;
                    break;
                }
            }
            System.out.print(windPower == 0 ? "C" : direction);
            System.out.print(" ");
            System.out.println(windPower);

        }
    }

    private enum Directions {
        // @formatter:off
        NNE(11.25,33.75),
        NE (33.75,56.25),
        ENE(56.25,78.75),
        E  (78.75,101.25),
        ESE(101.25,123.75),
        SE (123.75,146.25),
        SSE(146.25,168.75),
        S  (168.75,191.25),
        SSW(191.25,213.75),
        SW (213.75,236.25),
        WSW(236.25,258.75),
        W  (258.75,281.25),
        WNW(281.25,303.75),
        NW (303.75,326.25),
        NNW(326.25,348.75);
        // @formatter:on

        double min;
        double max;

        private Directions(double min, double max) {
            this.min = min;
            this.max = max;
        }

        public double getMin() {
            return min;
        }

        public double getMax() {
            return max;
        }

    }

    private enum WindPower {
        // @formatter:off
        L0 (0.0,0.2),
        L1 (0.3,1.5),
        L2 (1.6,3.3),
        L3 (3.4,5.4),
        L4 (5.5,7.9),
        L5 (8.0,10.7),
        L6 (10.8,13.8),
        L7 (13.9,17.1),
        L8 (17.2,20.7),
        L9 (20.8,24.4),
        L10(24.5,28.4),
        L11(28.5,32.6),
        L12(32.7,200.0);
        // @formatter:on

        double from;
        double to;

        private WindPower(double from, double to) {
            this.from = from;
            this.to = to;
        }

        public double getFrom() {
            return from;
        }

        public double getTo() {
            return to;
        }
    }
}
