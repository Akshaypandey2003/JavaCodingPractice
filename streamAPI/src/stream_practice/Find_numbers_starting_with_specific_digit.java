package stream_practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Find_numbers_starting_with_specific_digit {

    public static void execute()
    {
        int []arr = {10,15,18,25,32,16};
        List<String> res= Arrays.stream(arr).mapToObj(String::valueOf)
                .filter(num->((String) num)
                        .startsWith("1")).collect(Collectors.toList());

        System.out.println("problem 15.  Digits are: "+res);
    }
}
