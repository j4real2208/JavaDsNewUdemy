
package ArraySection;
import java.util.Arrays;

public class MissingNumber {

    static void missingArrayWithMem(int[] arr , int n ){
        int[] arr1 = new int[n];
        Arrays.stream(arr).sequential().forEach( x -> arr1[x-1] = 1 );
        for (int a = 0; a < arr1.length; a++) {
            if(arr1[a]==0){
                System.out.println(a+1);
            }
        }
    }
    static void WithOutMemMissingArray(int[] arr, int n){
        int sumArr = Arrays.stream(arr).sum();
        int sumProperOutput = (int) (n*( (float) (n+1)/2));
        System.out.println("sumArr = " + sumArr);
        System.out.println("sumProperOutput = " + sumProperOutput);
        System.out.printf("Missing Number is %d",sumProperOutput-sumArr);
    }
    public static void main(String[] args) {
        int[] arr = new int[]{ 1, 2, 3, 4, 5, 7, 8, 9, 10 };
        missingArrayWithMem(arr,10);
        WithOutMemMissingArray(arr,10);

    }

}
