package stream_practice;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Remove_nulls {
    public static void execute()
    {
        List<String> names = Arrays.asList("A", null, "C", null, "B");

        List<String> cleaned = names.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());

        System.out.println("Problem 22. List after removing nulls: "+cleaned);  // [A, C, B]

    }
}
