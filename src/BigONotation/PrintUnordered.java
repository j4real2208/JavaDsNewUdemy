package BigONotation;

public class PrintUnordered {
    static void UnorderedPrintPairs(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                var ans =  (10*arr[i])+arr[j];
                System.out.println("Number Formed = " + ans);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,5};
        UnorderedPrintPairs(arr);
    }
}
