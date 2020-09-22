package day1;

public class ex9 {

    public static void main(String[] args) {
        System.out.println("Range from 1 to " + args[0]);
        for(int i = 1; i <= Integer.parseInt(args[0]); i++) {
            System.out.println(fizzBuzz(i));
        }
    }

    private static String fizzBuzz(int number) {
        if (number % 15 == 0){
            return "fizzbuzz";
        } else if (number % 5 == 0){
            return "buzz";
        } else if (number % 3 == 0){
            return "fizz";
        }
        return String.valueOf(number);
    }
}