package Stream_Grouping;

import java.util.*;
import java.util.stream.*;


public class steam {
    public static void main(String[] args) {
//        List<String> list = List.of("java", "go", "c++","javaScript","C");
//
//        // grouping  by length
//        Map<Integer, List<String>> result =
//                list.stream()
//                        .collect(Collectors.groupingBy(s -> s.length()));
//        System.out.println(result);
//
//
//
//        // group + counting(each word)
//        Map<Integer, Long> result1 =
//                list.stream()
//                        .collect(Collectors.groupingBy(
//                                s -> s.length(),
//                                Collectors.counting()
//                        ));
//
//        System.out.println(result1);


//Group numbers and calculate sum of each group (even/odd).

        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8 ,9);

        Map<String, Integer> result =
                nums.stream()
                        .collect(Collectors.groupingBy(
                                n -> n %2 == 0 ? "Even" : "Odd",
                                Collectors.summingInt(n -> n)
                        ));
        System.out.println(result);

    }
}
