package Practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Processor {
    public static void main(String[] args) {
        int n = 2;
        Integer[] pt = {8,10};
        Integer[] tt = {3,1,8,7,4,2,5,2};
        ArrayList<Integer> p = new ArrayList<>();
        Collections.addAll(p, pt);
        ArrayList<Integer> t = new ArrayList<>();
        Collections.addAll(t,tt);
        System.out.println(processorTime(p,t));

    }
    static int processorTime(List<Integer> ProcessorTime, List<Integer> TaskTime)
    {
        int[][] time = new int[ProcessorTime.size()][4];
        int count = 0; int res = Integer.MIN_VALUE;
        Collections.sort(ProcessorTime);
        Collections.sort(TaskTime,Collections.reverseOrder());

        for (int i = 0; i < ProcessorTime.size(); i++) {
            for (int j = 0; j < 4; j++) {
                time[i][j] = ProcessorTime.get(i) + TaskTime.get(count);
                count++;
                res = Math.max(res,time[i][j]);

            }

        }
        return res;
    }
}
