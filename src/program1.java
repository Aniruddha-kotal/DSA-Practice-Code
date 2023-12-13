import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class program1 {
    public static void main(String[] args) {
        String str = "tree apple plant plant tree blue yellow orange plant tree";
        int i = 0;
        int j = 0;
        int k = 0;
        int n = str.length();
        String arr[] = new String[10];

        while(i<n){
            while(i<n && str.charAt(i) != ' ') i++;

            arr[k++] = str.substring(j,i);
            j = i+1;
            i++;
        }
        System.out.println(Arrays.toString(arr));
//        String[] arr = str.split(" ");
        HashMap<String,Integer> map = new HashMap<>();

        for(String word : arr){
            if(map.containsKey(word)){
                map.put(word, map.get(word)+1);
            }
            else{
                map.put(word,1);
            }
        }

        for (Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " :" + entry.getValue());
        }
    }
}
