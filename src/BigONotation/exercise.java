package BigONotation;

import java.util.ArrayList;

public class exercise {
    static void spof(int[] arrayList){
        int sum = 0 ;
        int product = 1;
        for (int i = 0; i < arrayList.length; i++) {
            sum+=arrayList[i];
            product+=arrayList[i];
        }
        System.out.println("product = " + product);
        System.out.println("sum = " + sum);
    }
    public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    spof(arr);
    }
}
