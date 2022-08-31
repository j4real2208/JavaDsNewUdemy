package ArraySection;

import java.util.EnumMap;
import java.util.HashMap;

public class CheckDuplicates {
    static boolean CheckDuplicate(int[] nums){

        HashMap hmap = new HashMap<Integer,Integer>();
        for( var x : nums){
            if(hmap.containsKey(x)) return true;
            else{
                hmap.put(x,1);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,7};
        var ans = CheckDuplicate(arr);
        System.out.println("ans = " + ans);

    }
}
