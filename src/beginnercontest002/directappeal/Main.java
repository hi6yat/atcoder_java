package beginnercontest002.directappeal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int xa = scanner.nextInt();
            int ya = scanner.nextInt();
            int xb = scanner.nextInt();
            int yb = scanner.nextInt();
            int xc = scanner.nextInt();
            int yc = scanner.nextInt();

            // xa,yaを(0,0)へ移動し、xa,yaを移動させた距離をxb、yb、xc、ycに反映
            xb -= xa;
            yb -= ya;
            xc -= xa;
            yc -= ya;
            System.out.println(Math.abs(xb * yc - yb * xc) * 0.5);
        }
    }

}
