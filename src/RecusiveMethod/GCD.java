package RecusiveMethod;

public class GCD {
    static int gcd(int a , int b ){
        if(a<0 || b<0){
            return -1;
        }
        if(b==0){
            return a;
        }else{
            var ans = gcd(b,a%b);
            return ans;
        }

    }
    public static void main(String[] args) {
        var ans = gcd(48,12);
        System.out.println("ans = " + ans);
    }
}
