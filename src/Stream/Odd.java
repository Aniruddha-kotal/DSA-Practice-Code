package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Odd {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11,2,3,45,9,90,87,8,2);

        List<Integer> ans = list.stream()
                .filter(e -> e % 2 != 0)
                .collect(Collectors.toList());

        System.out.println(ans);

    }
}
