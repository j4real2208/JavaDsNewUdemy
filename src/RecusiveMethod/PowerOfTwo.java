package RecusiveMethod;

public class PowerOfTwo {
    static int PowerTwo(int base, int power) {
        if(power< 0 || base < 0 ){
            return -1;
        }
        if(power==0){
            return 1;
        }else{
            var ans = base*PowerTwo(base,power-1 );
            return ans;
        }
    }
    public static void main(String[] args) {
        int ans = PowerTwo(2,5 );
        System.out.println("ans = " + ans);
    }
}
