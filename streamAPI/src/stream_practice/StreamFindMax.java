package stream_practice;

import java.util.List;

public class StreamFindMax
{
    public static void execute()
    {

        List<Integer> list = List.of(3,4,2,5,7);

        // Using max()
        //  Optional res = list.stream().max(Integer::compare);

        // Using reduce()
        int res = list.stream().reduce(0,(a,b)->a>b?a:b);
        System.out.println("Max number is: "+res);

    }
}
