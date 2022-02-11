package DataStructures.Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DuplicateValues {
    int count = 0;
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 3, 4};
        Arrays.stream(findDups(arr)).sequential().forEach(System.out::println);
    }

    private static int[] findDups(int[] arr) {
        int count = 0;
        int[] res = new int[arr.length];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>1){
                res[count] = entry.getKey();
                count++;
            }
        }
        return res;
    }

}
