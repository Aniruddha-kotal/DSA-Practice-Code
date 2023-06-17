package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageNumber {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,7);

        double ans = list.stream().mapToInt(a -> a).average().getAsDouble();

        System.out.println(ans);
    }
}
