package day1;

import java.util.Scanner;

public class ex3 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert first digit: ");
        int x = scanner.nextInt();

        System.out.print("Please insert second digit: ");
        int y = scanner.nextInt();

        boolean result = false;

        result = x > y ? true : false;
        System.out.println("If x is greater than y: " + result);

        result = x * 3 > y ? true : false;
        System.out.println("If x * 3 is greater than y: " + result);

        result = (y++ < ++x) && (--x < y++);
        System.out.println("If y++ is smaller than ++x and --x is smaller than y++: " + result);

        result = (x * y) % 2 == 0;
        System.out.println("If x * y is even: " + result);
    }
}