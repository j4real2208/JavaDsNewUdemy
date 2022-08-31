package ArraySection;

import java.util.HashMap;
import java.util.stream.IntStream;

public class TwoSum {
    static void NumberOfPairs(int[] arr , int target){
        HashMap hmap = new HashMap<Integer,Integer>();
        int[] finarr = new int[]{};
        for (int i : arr) {
            if(hmap.containsKey(i)){
                System.out.println("We found an pair --> ["+ i +" , " + (target-i) + "] " );
                var ans = IntStream.
                        range(0,arr.length).
                        filter( q -> arr[q] == i ).findFirst().orElse(-1);
                System.out.println("The pair is from index ["+ (int) hmap.get(i) + " , " + " "+ans+" ]" );

            }else{
                var ans = IntStream.
                        range(0,arr.length).
                        filter( q -> arr[q] == i ).findFirst().orElse(-1);
                hmap.put(target-i,ans);
            }
        }

    }
    public static void main(String[] args) {
        int[] arr = new int[]{ 2,7,11,15 ,3,6};
        int target = 9;
        NumberOfPairs(arr,target);
    }
}
