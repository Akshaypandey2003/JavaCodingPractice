package stream_practice;

import java.util.List;
import java.util.stream.Collectors;

public class StreamSortList {
    public static void execute()
    {

        List<Integer> list = List.of(3,4,2,5,7);

        // Ascending order
//        List<Integer> res = list.stream().sorted().collect(Collectors.toList());

        //Descending order
        List<Integer> res = list.stream().sorted((a,b)->b-a).collect(Collectors.toList());
        System.out.println("Sorted list is: "+res);

    }
}
