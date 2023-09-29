import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!\n\nSolving problem on dividing a String\n");

        String inString = "При ответах на технические вопросы сначала проговорите сам вопрос, на который собираетесь отвечать, а после этого озвучьте ответ";

        List<String> stringList = stringDivider(inString, 50);
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