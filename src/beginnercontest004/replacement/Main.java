package beginnercontest004.replacement;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Integer> list = new LinkedList<>();
    static {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            for (int i = 0; i < n % 30; i++) {
                swap(list, i % 5, i % 5 + 1);
            }
        }
        list.forEach(System.out::print);
        System.out.println();

    }

    static <T> void swap(List<T> list, int index1, int index2) {
        T tmp = list.get(index1);

        list.set(index1, list.get(index2));

        list.set(index2, tmp);
    }

}
