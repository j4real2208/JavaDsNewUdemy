package RecusiveMethod;

public class example {
    static void RecursiveMethod(int n ){
        if (n<1) {
            System.out.println("Base case reached");
            return;
        }
        RecursiveMethod(n-1);
        System.out.println("After Call n = " + n);
    }
    static void IterativeMethod(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("i = " + i);
        }
    }
    static int  PowerOfTwo(int n){
        if(n==0){
            return 1;
        }
        else{
            var power = 2*PowerOfTwo(n-1);
            return power;
        }
    }
    public static void main(String[] args) {


//        long RecursiveCallExecTime = System.nanoTime();
//        try {
//            RecursiveMethod(1000);
//        } finally {
//            RecursiveCallExecTime = System.nanoTime() - RecursiveCallExecTime;
//            System.out.printf("RecursiveCallExecTime = %dms%n",
//                    (RecursiveCallExecTime / 1_000_000));
//        }
//        long iterativeExecTime = System.nanoTime();
//        try {
//            IterativeMethod(1000);
//        } finally {
//            iterativeExecTime = System.nanoTime() - iterativeExecTime;
//            System.out.printf("iterativeExecTime = %dms%n",
//                    (iterativeExecTime / 1_000_000));
//        }

        int n = 6;
        System.out.println(" POwer of 2= " + PowerOfTwo(n));


    }
}
