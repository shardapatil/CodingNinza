import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
        HashSet<Integer> arrset = new HashSet<>();

        for (int item : arr) {
            if(!arrset.add(item))
            {
                return item;
            }
            else{
                arrset.add(item);
            }
        }
        return 0;
    }
}
