package Stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountCharacter {
    public static void main(String[] args) {
        String input = "helloIamAniruddha";


        Map<String, Long> map = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(map);

        String[] StringArray = input.split("");

        List<String> Duplicate1 = Arrays.stream(StringArray).filter(s -> Collections.frequency(List.of(StringArray), s) > 1).distinct().collect(Collectors.toList());

        List<String> Duplicate = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("1" + Duplicate1);
        System.out.println(Duplicate);

        String[] strArray = {"java","techei","SpringBoot","Microservices"};

        String LongestString = Arrays.stream(strArray)
                .reduce((a, b) -> a.length() > b.length() ? a : b)
                .get();

        System.out.println(LongestString);


        int[] numbers = {1,5,9,11,28,3,8,14};

        List<String> stringList = Arrays.stream(numbers).boxed()
                .map(s -> s + "")
                .filter(s -> s.startsWith("1"))
                .collect(Collectors.toList());

        System.out.println(stringList);

        //String.join method

        List<String> nos = Arrays.asList("1", "2", "3", "4");

        String result = String.join("-", nos);

        System.out.println(result);

        //Skip and Limit Method

        IntStream.rangeClosed(1,10)
                .skip(1)
                .limit(8)
                .forEach(System.out::print);
    }
}
