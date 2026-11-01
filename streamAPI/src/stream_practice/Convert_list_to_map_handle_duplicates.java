package stream_practice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Convert_list_to_map_handle_duplicates {
    public static void execute()
    {
        List<String> list = List.of("A", "B", "A");

        Map<String, Integer> map = list.stream()
                .collect(Collectors.toMap(
                       word -> word,
                        word -> word.length(),
                        (oldValue,newValue)->oldValue
                    ));

        System.out.println("Problem 19. List -> Map: "+map);  // {A=2, B=1}

    }
}
