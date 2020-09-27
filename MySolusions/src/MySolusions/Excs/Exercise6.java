package MySolusions.Excs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        float firstDigit = getFirstDigit();
        char operand = getOperand();
        float secondDigit = getSecondDigit();
        System.out.println("Final score: " + scoreOfCalculation(firstDigit, operand, secondDigit));
    }


    private static float getFirstDigit() {
        float firstDigit = 0;
        try {
            System.out.print("Inser first digit: ");
            Scanner scanner = new Scanner(System.in);
            firstDigit = scanner.nextFloat();
        } catch (InputMismatchException ex) {
            System.out.println("Please insert only digits!");
            System.exit(1);
        }
        return firstDigit;
    }

    private static char getOperand() {
        String operator;
        System.out.print("Inser operator: ");
        Scanner scanner = new Scanner(System.in);
        operator = scanner.next();
        if (operator.equals("*")) {
            return '*';
        }
        if (operator.equals("+")) {
            return '+';
        }
        if (operator.equals("-")) {
            return '-';
        }
        if (operator.equals("/")) {
            return '/';
        }
        return 0;
    }

    private static float getSecondDigit() {
        float secondDigit = 0;
        try {
            System.out.print("Inser second digit: ");
            Scanner scanner = new Scanner(System.in);
            secondDigit = scanner.nextFloat();
        } catch (InputMismatchException ex) {
            System.out.println("Please insert only digits!");
            System.exit(1);
        }
        return secondDigit;
    }

    private static float scoreOfCalculation(float firstDigit, char operand, float secondDigit) {

        float scoreOfCalculation = 0;

        if (operand == '*'){
            scoreOfCalculation = firstDigit*secondDigit;
        }
        if (operand == '-'){
            scoreOfCalculation = firstDigit-secondDigit;
        }
        if (operand == '+'){
            scoreOfCalculation = firstDigit+secondDigit;
        }
        if (operand == '/'){
            scoreOfCalculation = firstDigit/secondDigit;
        }
        return scoreOfCalculation;
    }
}
