package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LimitNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,10,20,30,1,13,2,2,10,30,19,3);
        // get first 5 numbers

        int sum = list.stream().limit(5).reduce((a, b)-> a+b).get();

        System.out.println(sum);

        //skip first 5 numbers

        Integer skip = list.stream().skip(5).reduce((p, q) -> p+q ).get();

        System.out.println(skip);
    }
}
