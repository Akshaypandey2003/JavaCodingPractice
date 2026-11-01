package stream_practice;

import java.util.Arrays;
import java.util.Optional;

public class Second_highest_number {

    public static void execute()
    {
        int num[] = {2,3,5,12,16,19};

        Optional<Integer> res = Arrays.stream(num)
                .boxed()                          // convert IntStream → Stream<Integer>
                .sorted((a,b) -> b-a)
                .distinct()
                .skip(1)
                .findFirst();

        System.out.println("Problem 24. Second highest number: "+res.get());
    }
}
