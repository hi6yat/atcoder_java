package beginnercontest001.windobservation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int deg = scanner.nextInt();
            int dis = scanner.nextInt();

            String Dir = "";
            int W = 0;
            double d = 0;
            for (WindRun windRun : WindRun.values()) {
                if (d >= windRun.getFrom() && d <= windRun.getTo()) {
                    W = windRun.getLevel();
                }
            }
            if (W == 0) {
                Dir = "C";
            }

            System.out.println(Dir + " " + W);

        }
    }
    
    private enum Direction {
        N(),
        NNE(),
        NE(),
        ENE(),
        E(),
        ESE(),
        SE(),
        SSE(),
        S(),
        SSW(),
        SW(),
        WSW(),
        W(),
        WNW(),
        NW(),
        NNW();
    }

    private enum WindRun {

        //@formatter:off
		l0(0, 0.0,     12), 
		l1(1, 0.3,     1.5), 
		l2(2, 1.6,     3.3), 
		l3(3, 3.4,     5.4), 
		l4(4, 5.5,     7.9), 
		l5(5, 8.0,    10.7), 
		l6(6, 10.8,   13.8), 
		l7(7, 13.9,   17.1), 
		l8(8, 17.2,   20.7), 
		l9(9, 20.8,   24.4), 
		l10(10, 24.5, 28.4), 
		l11(11, 28.5, 32.6), 
		l12(12, 32.7, 200);
		//@formatter:on

        int level;
        double from;
        double to;

        private WindRun(int level, double from, double to) {
            this.level = level;
            this.from = from;
            this.to = to;
        }

        int getLevel() {
            return level;
        }

        double getFrom() {
            return from;
        }

        double getTo() {
            return to;
        }
    }

}
