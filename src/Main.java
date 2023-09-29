import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!\n\nSolving problem on dividing a String\n");

        String inString = "При ответах на технические вопросы сначала проговорите сам вопрос, на который собираетесь отвечать, а после этого озвучьте ответ";

        List<String> stringList = stringDivider(inString, 40);
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
        int stringLength = string.length();

        if (string == "" || string == null || lengthOfPart <= 0) {throw new RuntimeException("Wrong Source Data");}

        do {
            endOfPart = Integer.min(beginningOfPart + lengthOfPart, stringLength) ;
            currentPosition = endOfPart - 1 ;

            // conditions for adjusting of endOfPart value:
            // endOfPart < length of string
            // charAt(endOfPart) is not a white space

            while(!Character.isWhitespace(string.charAt(currentPosition))&currentPosition>=beginningOfPart){
                currentPosition--;
            }
            if (currentPosition > beginningOfPart & endOfPart < stringLength){
                endOfPart = currentPosition + 1;
            }
            outSetOfStrings.add(string.substring(beginningOfPart, endOfPart));
            beginningOfPart = endOfPart;
        } while (beginningOfPart < stringLength);

        return outSetOfStrings;
    }
}