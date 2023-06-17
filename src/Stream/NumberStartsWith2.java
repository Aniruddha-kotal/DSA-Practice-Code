package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartsWith2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,-222,234,-2567,432,236,211,22);

        List<Integer> ans = list.stream()
                .map(e -> String.valueOf(e))
                .filter(e -> e.startsWith("2") || e.startsWith("-2"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        System.out.println(ans);

    }
}
