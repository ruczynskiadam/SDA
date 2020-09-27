package MySolusions.Author;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class apsik {
    public static void main(String[] args) {

            System.out.println(isConstansAsString("a psik"));
            System.out.println(isConstansAsString("aaaa psik"));
            System.out.println(isConstansAsString("aaaapsik"));
            System.out.println(isConstansAsString("psik"));

        }

        private static boolean isConstansAsString(String input){
            String regex = "a+ (psik|Psik)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            return matcher.matches();
        }

    }
}

