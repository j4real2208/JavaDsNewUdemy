package RecusiveMethod;

public class DecToBinary {
    static int ToBinary(int n){
        if(n==0){
            return 0;
        }
        return n%2+ToBinary(n/2)*10;
    }
    public static void main(String[] args) {
        int n = ToBinary(10);
        System.out.println("n = " + n);
    }
}
