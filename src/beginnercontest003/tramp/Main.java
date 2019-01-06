package beginnercontest003.tramp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String S = scanner.next();
            String T = scanner.next();
            boolean canWin = true;
            for (int i = 0; i < S.length(); i++) {
                char sChar = S.charAt(i);
                char tChar = T.charAt(i);
                if (sChar == '@') {
                    canWin = isChangable(tChar);
                } else if (tChar == '@') {
                    canWin = isChangable(sChar);
                } else {
                    canWin = sChar == tChar ? true : false;
                }
                if (!canWin)
                    break;
            }
            System.out.println(canWin ? "You can win" : "You will lose");
        }
    }

    private static boolean isChangable(char c) {
        boolean result;

        switch (c) {
        case '@':
        case 'a':
        case 't':
        case 'c':
        case 'o':
        case 'd':
        case 'e':
        case 'r':
            result = true;
            break;
        default:
            result = false;
            break;
        }

        return result;
    }

}
