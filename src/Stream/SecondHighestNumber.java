package Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class SecondHighestNumber {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,3,10,20,30,1,13,2,2,10,30,19,3,40,40);

       Integer SecondHighest =  list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();

        System.out.println(SecondHighest);

        int SecondLowest = list.stream().sorted().distinct().skip(1).findFirst().get();

        System.out.println(SecondLowest);
    }
}
