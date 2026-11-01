package stream_practice;

import java.util.List;

public class Convert_List_of_Strings_to_Uppercase {
    public static void execute()
    {
        List<String> words = List.of("akshay","nandu","khushi","jain");

        words.stream().map(word->word.toUpperCase()+" ").forEach(System.out::print);
        System.out.println();
    }
}
