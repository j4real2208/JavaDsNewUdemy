package ArraySection;

import java.util.Arrays;

public class ArrayStart {
    public static void main(String[] args) {
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i+1;
        }
        
        System.out.println(Arrays.stream(arr).sum());
    }
}
