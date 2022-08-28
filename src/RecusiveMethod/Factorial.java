package RecusiveMethod;

public class Factorial {
    static int FactorialRecursive(int n){
        if(n==0){
            return 1;
        }else{
            var answer = n*FactorialRecursive(n-1);
            return answer;
        }

    }
    public static void main(String[] args) {
        System.out.println(" Factorial= " + FactorialRecursive(5));
    }
}
