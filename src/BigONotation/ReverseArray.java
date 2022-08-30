package BigONotation;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArray {
    static int[] ReverseArr(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            int last_elementIndex = arr.length-i-1;
            int temp = arr[i];
            arr[i] = arr[last_elementIndex];
            arr[last_elementIndex] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        arr = ReverseArr(arr);
        System.out.println(Arrays.toString(arr));
    }
}
