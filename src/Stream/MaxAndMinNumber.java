package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMinNumber {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,3,10,20,30,1,13,2,2,10,30,19,3,90);

        int maxAns = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(maxAns);

        int  minAns = list.stream().min(Comparator.comparing(Integer::intValue)).get();
        System.out.println(minAns);
    }
}
