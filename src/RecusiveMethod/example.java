package RecusiveMethod;

public class example {
    static void RecursiveMethod(int n ){
        if (n<1) {
            System.out.println("Base case reached");
            return;
        }
        System.out.println(" Before Call n = " + n);
        RecursiveMethod(n-1);
        System.out.println("After Call n = " + n);
    }
    public static void main(String[] args) {
     RecursiveMethod(4);
    }
}
