package MySolusions.Excs;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;


public class Stoper {


    public static void main(String[] args) {

        stoper();
    }

        private static void stoper(){

            Scanner scanner = new Scanner(System.in);
            System.out.print("To start timing press ENTER");
            scanner.nextLine();
            LocalTime startTime = LocalTime.now();

            System.out.println("To stop timing press ENTER");
            scanner.nextLine();
            LocalTime stopTime = LocalTime.now();

            Duration duration = Duration.between(startTime, stopTime);
            System.out.println("Total time: " + duration.getSeconds() + "sec");

        }

    }
