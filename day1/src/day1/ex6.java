package day1;

public class ex6 {

    public static void main(String[] args) {
        printMultiplicationTableBasic();
        System.out.println("");
        printMultiplicationTable(5, 1, 4);
        System.out.println("");
        printMultiplicationTable(6, 2, 5);
    }

    private static void printMultiplicationTableBasic() {
        for(int i = 1; i <= 4; i++) {
            System.out.println("5 x " + i + " = " + (5*i));
        }
    }

    private static void printMultiplicationTable(int multipier, int minMultiplicand, int maxMultiplicand) {
/*        for (int i = minMultiplicand; i <= maxMultiplicand; i++) {
            int result = multipier * i;
            System.out.println(multipier + " x " + i + " = " + result);
        }*/

        // for(;;) -> correct structure
        for (; minMultiplicand <= maxMultiplicand; minMultiplicand++) {
            int result = multipier * minMultiplicand;
            System.out.println(multipier + " x " + minMultiplicand + " = " + result);
        }
    }
}