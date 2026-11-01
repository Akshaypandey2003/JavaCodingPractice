package stream_practice;

import java.util.List;
import java.util.stream.Collectors;

public class Count_Strings_with_Specific_Prefix {
    public static void execute()
    {
        List<String> words = List.of("Akshay","Shivam","akhil","akriti","akash");

        long res = words.stream().filter(s->s.startsWith("ak")).count();

        System.out.println("Strings with given prefix: "+res);
    }
}
