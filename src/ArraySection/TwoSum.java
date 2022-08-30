package ArraySection;

import java.util.HashMap;

public class TwoSum {
    static void NumberOfPairs(int[] arr , int target){
        HashMap hmap = new HashMap<Integer,Integer>();
        for (int i : arr) {
            if(hmap.containsKey(i)){
                System.out.println("We found an pair --> ["+ i +" , " + (target-i) + "] " );
            }else{
                hmap.put(target-i,1);
            }
        }

    }
    public static void main(String[] args) {
        int[] arr = new int[]{ 2,7,11,15 };
        int target = 9;
        NumberOfPairs(arr,target);
    }
}
