package RecusiveMethod;


import java.util.ArrayList;
import java.util.List;


public class FibonacciSeries {

    static int FibSeries(int n){
        if(n==0 || n==1){
            return n;
        }else{
            int ans = FibSeries(n-1)+FibSeries(n-2);
            return ans;
        }
    }

    public static void main(String[] args) {
        var v= FibSeries(4);
        System.out.println("v = " + v);
    }
}
