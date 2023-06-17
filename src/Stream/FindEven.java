package Stream;

import java.util.*;
import java.util.stream.Collectors;

public class FindEven {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9,10);


        List<Integer> ans = number.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        System.out.println(ans);
    }
}
