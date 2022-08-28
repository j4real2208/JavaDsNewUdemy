public class Main {
    static void firstMethod(){
        SecondMethod();
        System.out.println("Inside the first method");
    }
    static void SecondMethod(){
        ThirdMethod();
        System.out.println("Inside the Second method");
    }
    static void ThirdMethod(){
        FourthMethod();
        System.out.println("Inside the Third method");
    }
    static void FourthMethod(){
        System.out.println("Inside the Fourth method");
    }


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
        System.out.println("Hello world!");
        firstMethod();

    }
}
