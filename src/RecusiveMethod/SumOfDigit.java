package RecusiveMethod;

public class SumOfDigit {
    static int SumAllDigit(int n){
        if(n<0){
            return -1;
        }
        if(n==0) {
            return 0;
        }else {
            int rem = n%10+SumAllDigit(n/10);
            return rem;
        }

    }
    public static void main(String[] args) {
        var ans =  SumAllDigit(4325);
        System.out.println("ans = " + ans);
        
    }
}
