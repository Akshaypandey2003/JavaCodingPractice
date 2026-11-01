package stream_practice;

import java.util.Arrays;
import java.util.List;

public class Check_if_Any_String_Matches_a_Condition {
    public static void execute()
    {
        List<String> words = Arrays.asList("Java", "Stream API", "Lambda");
        boolean res = words.stream().anyMatch(word->word.contains("a"));

        System.out.println("Is condition true: "+res);

    }
}
