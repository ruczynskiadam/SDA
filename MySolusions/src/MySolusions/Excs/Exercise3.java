package MySolusions.Excs;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
    float weight = getWeight();   //kg's
    int height = getHeight();     //cm's
    float BMI = calculateBMI(weight, height);
    infoAboutOptimalWeight(BMI);
    }


    private static float calculateBMI(float weight, int height) {
        float heightInMeter = (float)height/100;
        double BMI = weight / Math.pow(heightInMeter, 2);
        return (float) BMI;

    }

    private static float getWeight() {
        System.out.print("Insert your weight in [kg]: ");
        Scanner scanner = new Scanner(System.in);
        float weight = scanner.nextFloat();
        return (float) weight;

    }
    private static int getHeight(){
        System.out.print("Insert your height in [cm]: ");
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        return height;

    }
    private static void infoAboutOptimalWeight(float BMI) {
         if (BMI > 18.5 && BMI < 24.9){
             System.out.println("BMI is correct!");
         }
         else {
             System.out.println("BMI isn't correct");
         }
            System.out.println("Your BMI is: "+ BMI);
    }
}
