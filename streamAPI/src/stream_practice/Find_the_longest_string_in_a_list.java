package stream_practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Find_the_longest_string_in_a_list {

    public static void execute()
    {
        List<String> words = Arrays.asList("Delhi","Bangalore","Mumbai");

        Optional<String> res = words.stream().reduce((str1,str2)->str1.length() > str2.length() ? str1 : str2);

        System.out.println("Largest string is: "+res.get());

        Optional<Map.Entry<Integer, List<String>>> len = words.stream()
                .collect(Collectors.groupingBy(String::length))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, List<String>>comparingByKey().reversed())
                .findFirst();

        System.out.println("Longest length entry: " + len);
    }
}
