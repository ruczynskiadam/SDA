package MySolusions.Excs;

public class Exercise7b {
    public static void main(String[] args) {
        displayFirstTab();
        System.out.println();
        displaySecondTab();
    }

    private static void displayFirstTab() {
        int sizeOfTab = 100;
        int [] array = new int[sizeOfTab];
        int numberOfTab = 1;

        System.out.println("\t\tFirst Tab\t\t");
        for (int i = 0; i < sizeOfTab-1; i++){

            if(numberOfTab%10 == 0 && numberOfTab!=1){
                System.out.println();
            }
            array[i] = numberOfTab;
            numberOfTab++;
            System.out.print(" " +numberOfTab);

        }
    }

    private static void displaySecondTab() {
        int sizeOfTab = 100;
        int [] array = new int[sizeOfTab];
        int numberOfTab = 1;

        System.out.print("\t\tSecond Tab\t\t");
        for (int i = 0; i < sizeOfTab; i++){

            if(numberOfTab%10 == 0 && numberOfTab!=1){
                System.out.println();
            }
            array[i] = numberOfTab;
            numberOfTab++;
            System.out.print(" " +numberOfTab);

        }
    }
}
