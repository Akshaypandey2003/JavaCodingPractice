package stream_practice;

import java.util.Arrays;
import java.util.List;

public class Concatenate_Strings {

    public static void execute()
    {
        List<String> words = Arrays.asList("I","am","a","Developer");

        String concatendatedString = words.stream().reduce("",(a,b)->a+" "+b);

        System.out.println("Concatendated string is: "+concatendatedString);
    }
}
