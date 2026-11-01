package stream_practice;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Non_Repeated_Character_in_a_String {

    public static void execute() {

        String str = "akshay";

        Optional<Character> res = str.chars()
                /*
                 * chars() returns an IntStream of Unicode values (ASCII codes).
                 * Example: "akshay" → [97, 107, 115, 104, 97, 121]
                 * We cannot directly work with characters here, only integers.
                 */

                .mapToObj(c -> (char) c)
                /*
                 * mapToObj() converts each int (Unicode value) into a Character object.
                 * This is REQUIRED because:
                 * - Stream<Character> is needed to use methods like indexOf(char)
                 * - Object streams support reference types, not primitives
                 * Example: [97,107,115,104,97,121] → ['a','k','s','h','a','y']
                 */

                .filter(chr -> str.indexOf(chr) == str.lastIndexOf(chr))
                /*
                 * filter() keeps only NON-REPEATED characters.
                 *
                 * indexOf(chr)      → first occurrence index
                 * lastIndexOf(chr)  → last occurrence index
                 *
                 * If both are equal → character occurs exactly once
                 * Example:
                 * 'a' → indexOf = 0, lastIndexOf = 4 → repeated ❌
                 * 'k' → indexOf = 1, lastIndexOf = 1 → non-repeated ✅
                 */

                .findFirst();
        /*
         * findFirst() is a TERMINAL operation.
         * It returns the first element that matches the filter condition.
         *
         * Return type is Optional<Character> because:
         * - The stream may be empty
         * - Prevents NullPointerException
         */

        System.out.println(
                "First non repeating character in the given string is : " + res.get()
        );
        /*
         * get() retrieves the value from Optional.
         * Safe here because we know at least one non-repeating character exists.
         * (In production code, prefer isPresent() or orElse())
         */


        /* Above Stream code Time complexity is O(n^2) */

        /* Optimised O(n) Solution */
//        MalformedParameterizedTypeException<Character, Long> freqMap =
//                str.chars()
//                        .mapToObj(c -> (char) c)
//                        .collect(Collectors.groupingBy(
//                                c -> c,
//                                LinkedHashMap::new,
//                                Collectors.counting()
//                        ));
//
//        freqMap.entrySet().stream()
//                .filter(e -> e.getValue() == 1)
//                .findFirst()
//                .ifPresent(e ->
//                        System.out.println("First non repeating character is: " + e.getKey())
//                );
    }
}

