package MySolusions.Excs;

import java.util.Scanner;

public class Exercise1 {

    public static final String HEXA = "Hexadecimal";
    public static final String DECA = "Decimal";
    public static final String BIN = "Binary";

    public static void main(String[] args) {

        displayWord(HEXA);
        displayWord(DECA);
        displayWord(BIN);
    }
    private static void displayWord(String format){

        switch(format){
            case HEXA:
                displayWordInHexa();
           // case DECA:
            //    displayWordInDeca();
           // case BIN:
            //    displayWordInBin();
        }
    }
    private static void displayWordInHexa(){

        char S = 83;
        char D = 68;
        char A = 65;

        System.out.print(S);
        System.out.print(D);
        System.out.print(A);

    }

    }
