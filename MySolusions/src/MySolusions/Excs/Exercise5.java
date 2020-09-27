package MySolusions.Excs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
 //       displayMultiplicationTable();
          int multiplier = getMultiplier();
          int minMultiplicand = getMinMultiplicand();
          int maxMultiplicand = getMaxMultiplicand();
          convertedMultiplcationTable(multiplier, minMultiplicand, maxMultiplicand);
    }

 //   private static String displayMultiplicationTable() {
 //       int multiplicationScore = 0;
//
 //       for (int i = 1; i <= 4; i++) {
 //           multiplicationScore = 5*i;
 //           System.out.println("5x" + i + "=" + multiplicationScore);
//        }
//        return String.valueOf(0);
 //   }

    private static int getMultiplier() {
        int multiplier = 0;
        try{
            System.out.println("Insert max multiplier: ");
        Scanner scanner = new Scanner(System.in);
        multiplier = scanner.nextInt();}
        catch (InputMismatchException ex){
            System.out.println("Please insert only digits!");
            System.exit(1);
        }
        return multiplier;
    }

    private static int getMinMultiplicand() {
        int minMultiplicand = 0;
        try{
            System.out.println("Insert min multiplicand: ");
            Scanner scanner = new Scanner(System.in);
        minMultiplicand = scanner.nextInt();}
        catch (InputMismatchException ex){
            System.out.println("Please insert only digits!");
            System.exit(1);
        }
        return minMultiplicand;
    }

    private static int getMaxMultiplicand() {
        int maxMultiplicand = 0;
        try{
            System.out.println("Insert max multiplicand: ");
            Scanner scanner = new Scanner(System.in);
            maxMultiplicand = scanner.nextInt();}
        catch (InputMismatchException ex){
            System.out.println("Please insert only digits!");
            System.exit(1);
        }
        return maxMultiplicand;
}

    private static String convertedMultiplcationTable(int multiplier, int minMultiplicand, int maxMultiplicand){
        int sum = 0;
        for (; minMultiplicand<=maxMultiplicand; minMultiplicand++){
            sum = multiplier*minMultiplicand;
            System.out.println(multiplier + "x"+ minMultiplicand + "=" + sum);
        }
        return String.valueOf(0);
    }
}
