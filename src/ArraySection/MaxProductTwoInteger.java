package ArraySection;

public class MaxProductTwoInteger {

    public static void main(String[] args) {
        int[] nums = new int[]{10,20,30,40,50};
        int max1 = 0 ;
        int max2 = 0 ;

        for (int i = 0; i < nums.length; i++) {
            max2 = Math.max(max2 , Math.min(max1,nums[i] ));
            max1 = Math.max(max1 , nums[i]);
            System.out.println("The current max so far is [ "+max2 + ", "+ max1 + " ]" +"and the product is "+(max1*max2));

        }

    }
}
