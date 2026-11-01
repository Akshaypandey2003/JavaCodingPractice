package stream_practice;

import java.util.*;
public class ReverseStrings {
    
    public static void execute() {
        String[] strings = {"Hello", "World", "Java", "Stream"};

        List<String> ans = Arrays.stream(strings).map(str -> new StringBuilder(str).reverse().toString())
                .toList();
        
                System.out.println("Problem 28. Reverse each string in a list: "+ans);
    }
}
