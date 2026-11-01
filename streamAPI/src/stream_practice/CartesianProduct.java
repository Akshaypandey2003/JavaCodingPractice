package stream_practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CartesianProduct {
    public static void execute() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5);
        List<String> cartesianProduct = list1.stream()
                .flatMap(i -> list2.stream().map(j -> "(" + i + "," + j + ")"))
                .collect(Collectors.toList());
        System.out.println("Problem 29. Cartesian Product of Two Lists: " + cartesianProduct);
    }
}
