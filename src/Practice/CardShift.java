package Practice;

import java.util.ArrayList;
import java.util.*;

public class CardShift {
    public static void main(String[] args) {
        String[] cards = {"black","grey","brown","red","pink"};
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,cards);
        int start = 4;
        String target = "black";
        System.out.println(shiftCards(list,start,target));

    }
    public static int shiftCards(List<String> cards,int startIndex,String target)
    {
        int endIndex = cards.indexOf(target);
        int forward = 0,backward = 0;
        if(endIndex==startIndex)
            return 0;
        if(Math.abs(startIndex-endIndex)==1)
            return 1;
        if(startIndex<endIndex)
        {
            forward = endIndex - startIndex;
            backward = startIndex + ((cards.size()-1) - endIndex) + 1;
        }
        if(endIndex<startIndex)
        {
            forward = endIndex + ((cards.size()-1)-startIndex) +1;
            backward = startIndex - endIndex;
        }
        int min = Math.min(forward,backward);
        return min;
    }
}
