package ArrayProject;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TemperatureDisplay {
    static float ReturnAvg(int[] arr ,int n ){
        var sum = Arrays.stream(arr).sum();
        return ((float) sum)/n;
    }
    public static void main(String[] args) {
        while(true){
            System.out.println("Do you want to enter or exit program ?");
            System.out.println("1. To Continue ");
            System.out.println("2. To Exit ");
            System.out.printf("Enter the your choice --> ");
            Scanner sc = new Scanner(System.in);
            var ans = sc.next();
            System.out.println("-----------------------");
            if (ans.equals("1")){
                System.out.println("Welcome to calculate Avg Temperature");
                System.out.printf("Enter the Number of Days --> ");
                var NumberOfDays = sc.nextInt();
                int[] arr = new int[NumberOfDays];
                for (int i = 0; i < NumberOfDays; i++) {
                    System.out.printf("Enter the %d Number --> ",i+1);
                    arr[i] = sc.nextInt();
                }
                System.out.println(Arrays.toString(arr));
                System.out.println();
                var OutAvgAns = ReturnAvg(arr,NumberOfDays);
                System.out.println("The average temperature of "+NumberOfDays+" is --> "+OutAvgAns);
                System.out.println();
                List<Integer> list = Arrays.stream(arr).boxed().toList();
                System.out.println("--------------------------------------------------------------");
                list.stream().
                        filter(s -> s.floatValue() > OutAvgAns).
                        forEach(x -> {
                            System.out.println("* The Day's above Average is Day "+list.indexOf(x.intValue())+" and Temperature "+x+" Degree Celsius");
                        });
                System.out.println("--------------------------------------------------------------");
                System.out.println();
            }else{
                System.out.println("See you again");
                break;
            }
        }
    }
}
