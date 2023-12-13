package Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,10,20,30,1,13,2,2,10,30,19,3);

        List<Integer> AscAns =  list.stream().sorted().collect(Collectors.toList());

        System.out.println(AscAns);

        List<Integer> DescAns = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());

        System.out.println(DescAns);
    }
}
