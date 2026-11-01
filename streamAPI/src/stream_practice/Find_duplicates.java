package stream_practice;

import java.util.*;

public class Find_duplicates {

    public static void execute()
    {
        List<Integer> numbers = Arrays.asList(2,5,7,2,12,5,8);

        //Using sets
        Set<Integer> unique = new LinkedHashSet<>();

         numbers.stream()
                .filter(num->!unique.add(num)).map(num->num+" ").forEach(System.out::print);
         System.out.println();

        // We can also use strings( convert list->string & match index)
    }
}
