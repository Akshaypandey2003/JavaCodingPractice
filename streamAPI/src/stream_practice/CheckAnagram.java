package stream_practice;

import java.util.Map;
import java.util.stream.Collectors;

public class CheckAnagram
{
    public static void isAnagram(String str1, String str2)
    {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        Map<Character, Long> map1 = str1.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));

        Map<Character, Long> map2 = str2.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));

        System.out.println("Problem : 25 Is Anagram: "+map1.equals(map2));
    }
}
