package stream_practice;

import java.util.List;
import java.util.stream.Stream;

public class Average_of_numbers {
    public static     void execute()
    {
        double avg = Stream.of(23,54,98).mapToInt(Integer::intValue).average().orElse(0);

        System.out.println("problem 21. Average is: "+avg);
    }
}
