package MySolusions.Excs;

import java.util.Scanner;

public class Exercise2 {

    private static final float PI = 3.14f;

    public static void main(String[] args) {
        float diameter = getValue();
        System.out.println("Circut is: " + calculateCircuit(diameter));
        System.out.println("Area is: " + calculateArea(diameter));
    }
    private static float getValue() {
        System.out.print("Please, insert diameter: ");
        Scanner scanner = new Scanner(System.in);
        float diameter = scanner.nextFloat();
        return diameter;
    }
    private static float calculateCircuit(float diameter) {
        float circuit = 2*PI*(diameter/2);
        return circuit;
    }
    private static float calculateArea(float diameter){
        double area = PI * Math.pow(diameter/2 , 2);
        return (float)area;
    }
}