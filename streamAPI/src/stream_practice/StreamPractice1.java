package stream_practice;

import java.util.*;
import java.util.stream.Collectors;

public class StreamPractice1
{
    public static void execute()
    {

        List<Integer> list = List.of(3,4,2,5,7);

        List<Integer> res = list.stream().filter(num->num%2==0).sorted().collect(Collectors.toList());

        System.out.println("Even numbers are: "+res);

    }
}
