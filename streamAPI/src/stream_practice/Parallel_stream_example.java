package stream_practice;

import java.util.List;

public class Parallel_stream_example {

    public static void execute()
    {
        int sum = List.of(1,2,3,4,5,6,7,8,9)
                .parallelStream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Problem 23. Parallel Stream: "+sum); // 45

    }
}
