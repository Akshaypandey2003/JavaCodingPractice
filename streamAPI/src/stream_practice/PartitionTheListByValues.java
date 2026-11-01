package stream_practice;

import java.util.*;
import java.util.stream.Collectors;

public class PartitionTheListByValues {
    
    public static void execute(){

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Map<Boolean,List<Integer>> partitionedValues = 
        numbers.stream().collect(Collectors.partitioningBy(num->num%2==0));

        System.out.println("Problem 27. Partition By Even & Odd Values: "+partitionedValues);
    }
}
