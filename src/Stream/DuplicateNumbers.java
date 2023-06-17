package Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,10,20,30,1,13,2,2,10,30,19,3);

        Set<Integer> ans = list.stream().filter(e -> Collections.frequency(list, e) > 1)
                .collect(Collectors.toSet());

        System.out.println(ans);
    }
}
