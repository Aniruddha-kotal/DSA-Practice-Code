package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Sum {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

        Optional<Integer> ans = numbers.stream().reduce((a, b) -> a + b);

        System.out.println(ans.get());
    }
}
