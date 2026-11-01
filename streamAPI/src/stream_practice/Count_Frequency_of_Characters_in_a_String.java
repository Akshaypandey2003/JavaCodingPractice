package stream_practice;

import java.util.List;
import java.util.stream.Collectors;

public class Count_Frequency_of_Characters_in_a_String {
    public static void execute()
    {
        String str = "Bangalore";

        String res = str.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()))
                .entrySet().stream().map(entry->entry.getKey()+"->"+entry.getValue())
                .collect(Collectors.joining(","));

        System.out.println("Frequency is: "+res);
    }
}
