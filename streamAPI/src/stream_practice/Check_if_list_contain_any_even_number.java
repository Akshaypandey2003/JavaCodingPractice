package stream_practice;

import java.util.List;

public class Check_if_list_contain_any_even_number {

    public static void execute()
    {
        boolean hasEven = List.of(1,3,5,7,8)
                .stream()
                .anyMatch(n -> n % 2 == 0);

        System.out.println("Problem 20.  does list have even number:"+hasEven);  // true

    }
}
