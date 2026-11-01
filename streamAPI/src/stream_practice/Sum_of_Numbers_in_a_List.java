package stream_practice;

import java.util.List;

public class Sum_of_Numbers_in_a_List {
    public static void execute()
    {
        List<Integer> numbers = List.of(2,5,3,8,9,10);

        int sum = numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println("sum is: "+sum);
    }
}
