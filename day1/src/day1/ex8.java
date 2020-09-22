package day1;

public class ex8 {

    public static void main(String[] args) {
        System.out.println("Range from 0 to " + args[1]);
        System.out.println("Prime numbers: ");
        for (int i = Integer.parseInt(args[0]); i <= Integer.parseInt(args[1]); i++) {
            if(isPrimeNumberWithForLoop(i)) {
                System.out.println(i);
                //System.out.println(i + " is a prime number");
            }
        }
    }

    private static boolean isPrimeNumberWithForLoop(int number) {
        if(number < 2) {
            return false;
        }
        for(int i = 2; i <= number/2; i++) {
            if(number%i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPrimeNumberWithWhileLoop(int number) {
        if(number < 2) {
            return false;
        }
        int i = 2;
        while(i <= number/2)
        {
            if(number % i == 0)
            {
                return false;
            }
            ++i;
        }
        return true;
    }
}