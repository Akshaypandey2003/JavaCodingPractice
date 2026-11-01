package stream_practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flatten_a_List_of_Lists {

    public static void execute()
    {
        List<List<Integer>> list = Arrays.asList(Arrays.asList(1,3,2,5,6),Arrays.asList(98,67,32,23));

        List<Integer> res = list.stream().flatMap(List::stream).sorted().collect(Collectors.toList());

        System.out.println("Flattened list is: "+res);
    }
}
