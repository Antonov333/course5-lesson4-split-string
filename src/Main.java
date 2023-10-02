import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!\n\nSolving problem on dividing a String\n");

        String inString = "In computer programming, a software framework is an abstraction in which software," +
                " providing generic functionality, can be selectively changed by additional user-written code, " +
                "thus providing application-specific software. It provides a standard way to build and deploy " +
                "applications and is a universal, reusable software environment that provides particular " +
                "functionality as part of a larger software platform to facilitate the development of software " +
                "applications, products and solutions.";

        List<String> stringList = stringDivider(inString, 65);
        for (String s : stringList
        ) {
            System.out.println(s);
        }
    }

    public static List<String> stringDivider(String string, int lengthOfPart) {
        List<String> outSetOfStrings = new ArrayList<>();
        int beginningOfPart = 0;
        int endOfPart = 0;
        int currentPosition;

        if (string == null || string.isEmpty() || lengthOfPart <= 0) {
            throw new RuntimeException("Wrong Source Data");
        }

        int stringLength = string.length();

        do {
            endOfPart = Integer.min(beginningOfPart + lengthOfPart, stringLength);
            currentPosition = endOfPart - 1;

            // conditions for adjusting of endOfPart value:
            // endOfPart < length of string
            // charAt(endOfPart) is a letter
            // next char is a letter

            while (!Character.isWhitespace(string.charAt(currentPosition))
                    & currentPosition > beginningOfPart
                    /*& currentPosition > 0*/)
            {
                currentPosition--;
            }
            if (currentPosition > beginningOfPart & endOfPart < stringLength) {
                endOfPart = currentPosition + 1;
            }

            outSetOfStrings.add(string.substring(beginningOfPart, endOfPart));
            beginningOfPart = endOfPart;
        } while (beginningOfPart < stringLength);

        return outSetOfStrings;
    }
}