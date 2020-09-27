package day1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex2 {

    private static final float PI = 3.14f;

    public static void main(String[] args) {
        float diameter = getDiameterFromUser();
        float circumferenceOfACircle = calculateCircumferenceOfACircle(diameter);
        float areaOfCircle = calculateAreaOfCircle(diameter);

        System.out.println("Circumference Of A Circle: " + circumferenceOfACircle);
        System.out.println("Area Of A Circle: " + areaOfCircle);
    }


    private static float getDiameterFromUser() {
        Scanner scanner = new Scanner(System.in);
        float diameter = 0;
        try {
            System.out.print("Please insert diameter: ");
            diameter = scanner.nextFloat();
        } catch(InputMismatchException ex) {
            System.out.println("Please insert only digits!");
            System.exit(1);
        }
        return diameter;
    }

    private static float calculateCircumferenceOfACircle(float diameter) {
        float radius = getRadius(diameter);
        //return  2 * PI * radius;
        return 2 * (float)Math.PI * radius;
    }

    private static float calculateAreaOfCircle(float diameter) {
        float radius = getRadius(diameter);
        //return PI * radius * radius;
        return (float)Math.PI * radius * radius;
    }

    private static float getRadius(float diameter) {
        return diameter / 2;
    }
}