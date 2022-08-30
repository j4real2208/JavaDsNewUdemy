package BigONotation;

public class PairSum {

    static void PrintPairs(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                var ans =  (10*arr[i])+arr[j];
                System.out.println("Number Formed = " + ans);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,5};
        PrintPairs(arr);
    }
}
