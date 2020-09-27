package MySolusions.Excs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        int x = getFirstDigit();
        int y = getSeconDigit();
        System.out.print(sum(x, y));
    }

    private static int getFirstDigit() {

        int x = 0;
        try {
            System.out.print("Insert first digit: ");
            Scanner scanner = new Scanner(System.in);
            x = scanner.nextInt();
        } catch (InputMismatchException ex){
            System.out.println("Please insert only digits!");
            System.exit(1);
        }
        return x;

    }
    private static int getSeconDigit(){

        int y = 0;
        try {
            System.out.print("Insert first digit: ");
            Scanner scanner = new Scanner(System.in);
            y = scanner.nextInt();
        } catch (InputMismatchException ex){
            System.out.println("Please insert only digits!");
            System.exit(1);
        }
        return y;
    }


    private static int sum(int x, int y){
        int sum = 0;

        for(; x<=y; x++){
            sum+=x; }
        return sum;

    }
}
