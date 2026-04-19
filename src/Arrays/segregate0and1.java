package Arrays;
import java.util.Arrays;
class Segregate0And1 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0};
        Solution obj = new Solution();
        obj.segregate0and1(arr);
        System.out.println(Arrays.toString(arr));
    }
}
class Solution {
    void segregate0and1(int[] arr) {
        int zeroCount = 0;
        int onesCount=0;
        for (int ele : arr) {
            if (ele == 0) zeroCount++;
        }
        for (int i = 0; i < zeroCount; i++) {
            arr[i] = 0;
        }
        for (int i = zeroCount; i < arr.length; i++) {
            arr[i] = 1;
        }
    }
}
