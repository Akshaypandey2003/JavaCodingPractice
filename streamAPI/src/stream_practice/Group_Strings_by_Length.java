package stream_practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Group_Strings_by_Length {
    public static void execute()
    {
        List<String> words = Arrays.asList("Bangalore","Delhi","Mumbai");

        words.stream()
                .collect(Collectors.groupingBy(String::length))
                .entrySet().stream()
                .map(entry->entry.getKey()+" - "+entry.getValue()).forEach(System.out::print);
        System.out.println();
    }
}