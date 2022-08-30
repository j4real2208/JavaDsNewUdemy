public class PrintPowerof2 {
    static int Print2OfPower(int n){
        if (n<1){
            return 0;
        } else if (n == 1) {
            System.out.println("n = " + n);
            return n;
        }else{
            int prev = Print2OfPower(n/2);
            int cur = 2*prev;
            System.out.println("cur = " + cur);
            return cur;
        }
    }
    public static void main(String[] args) {
        System.out.println("Ans = " + Print2OfPower(3));
    }
}
