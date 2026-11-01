package stream_practice;

import java.util.List;
import java.util.stream.Collectors;

public class PalindromicStrings {

    public static void findPalindromicStrings(List<String> words)
    {
        List<String> palindromes = words.stream().filter(word->word.
                equals(new StringBuilder(word).reverse().toString())).collect(Collectors.toList());

        System.out.println("Problem 26. Palindromic Substrings are: "+ palindromes);
    }
}
