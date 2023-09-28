import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!\n\nSolving problem on dividing a String");

        /*
        Problem Solving plan
        Form of software: single method stringDivider
        Choose Return type: List of strings
        Choose Set of arguments: source string, length of part
         */

        List<String> stringList = stringDivider("blablablabla", 6);
        for (String s : stringList
        ) {
            System.out.println(s);
        }

    }

    public static List<String> stringDivider(String string, int lengthOfPart) {
        List<String> outSetOfStrings = new ArrayList<>();
        int nextCharIndex = 0;
        int endOfPart = 0;
        do {
            endOfPart = nextCharIndex + lengthOfPart;
            if (endOfPart > string.length()) {
                endOfPart = string.length();
            }
            outSetOfStrings.add(string.substring(nextCharIndex, endOfPart));
            nextCharIndex = nextCharIndex + lengthOfPart;
        } while (nextCharIndex < string.length());

        return outSetOfStrings;
    }
}