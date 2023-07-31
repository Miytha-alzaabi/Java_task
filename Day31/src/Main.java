import java.sql.Array;
import java.util.Arrays;


// Sort the elements of an array in ascending order.
public class Main {
    public static void main(String[] args) {
//        int[] nums ={5,2,3,1};
//        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));


        //Another ways sor Sorting
        int[] nums ={5,2,3,1,6,10};
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] > nums[j]) {
                    n = nums[i];
                    nums[i] = nums[j];
                    nums[j] =n;
                }

            }System.out.print(nums[i] + " ");
        }



    }
}