package Arrays;

                               // 189. LEETCODE PROBLEM (IMPORTANT) GO TO LEET CODE FOR BETTER UNDERSTANDING
import java.util.*;

public class leetcoderotatearray {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int k = 3;

        leetcoderotatearray obj = new leetcoderotatearray();
        obj.rotate(nums, k);

        System.out.println(Arrays.toString(nums));
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
