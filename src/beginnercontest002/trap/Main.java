package beginnercontest002.trap;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println(scanner.next().replaceAll("(a|i|u|e|o)", ""));
        }
    }

}
