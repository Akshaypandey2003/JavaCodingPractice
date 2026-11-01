package stream_practice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Find_elements_that_appear_exactly_once {
    public static void execute()
    {
        List<Integer> nums = List.of(11, 2, 2, 3, 3, 3, 4);

        List<Integer> unique = nums.stream().collect(Collectors.groupingBy(num->num,Collectors.counting()))
                .entrySet().stream().filter(entry->entry.getValue()==1).map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("problem 16. Elements that appear only once: "+unique );
    }
}
