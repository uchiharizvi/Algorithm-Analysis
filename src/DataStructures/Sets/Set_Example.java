package DataStructures.Sets;

import java.util.*;

public class Set_Example {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 7};
        int arr2[] = {1, 2, 3, 4, 5, 5, 6, 7, 8, 9};
        System.out.println(findDups(arr));
        System.out.println(findDups(arr2));
    }

    public static boolean findDups(int[] arr) {
        Hashtable<Object, Object> existingValues = new Hashtable<>();
        for (int i = 0; i < arr.length; i++) {
            if (existingValues.isEmpty()) existingValues.put(arr[i], 1);//fix this
            else return true;
        }
        return false;
    }
}
