package Arrays;

public class missingnumber {
    public static void main(String[] args) {

        int[] nums = {3, 0, 1};

        MissingNumberSolution obj = new MissingNumberSolution();
        int result = obj.missingNumber(nums);

        System.out.println("Missing Number = " + result);
    }
}
class MissingNumberSolution {
    public int missingNumber(int[] nums) {

        int n = nums.length;

        // sum of 0 to n
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int ele : nums) {
            actualSum += ele;
        }

        return expectedSum - actualSum;
    }
}
