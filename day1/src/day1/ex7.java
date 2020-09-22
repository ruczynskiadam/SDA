package day1;

import java.util.Scanner;

public class ex7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String decision;
        do {
            System.out.print("Please insert first digit: ");
            float a = input.nextFloat();
            input.nextLine();
            System.out.print("Please insert operator (+ - / *): ");
            String operator = input.nextLine();
            System.out.print("Please insert second digit: ");
            float b = input.nextFloat();
            input.nextLine();

            float result = calculate(a, b, operator);
            System.out.println("Result: " + a + operator + b + " = " + result);
            System.out.print("New calculation or Stop?");
            decision = input.nextLine();
        } while(!"Stop".equalsIgnoreCase(decision));

        input.close();
    }

    private static float calculate(float a, float b, String operator) {
        float result = 0;
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if(b == 0) {
                    System.out.println("Wrong operation");
                    System.exit(1);
                }
                result = a / b;
                break;
            default:
                System.out.println("Operator not exist");
                System.exit(1);
        }
        return result;
    }
}