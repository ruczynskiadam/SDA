package day1;

public class ex5 {

    public static void main(String[] args) {
        System.out.println(sumOfTheSequence(4, 11));
    }

    private static int sumOfTheSequence(int x, int y) {
        if(x > y) {
            return -1;
        }
        int result = 0;

        //#1 option
        for (int i = x; i <= y; i++) {
            result += i;
        }

        //#2 option
        /*while(x <= y) {
            result += x;
            x++;
        }*/

        //#3 option
        /*do {
            result += x;
            x++;
        } while(x <= y);*/

        return result;
    }

}