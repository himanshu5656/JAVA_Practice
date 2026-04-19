package Linear_Search;



public class LS {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 5, 19, -3, 54, 24, 41};
        int target = 29;
        int ans = LS(nums, target);
        System.out.println(ans);
    }
    // search  in the array : return the index if item is found
    // otherwiae if the item is not found return -1

    static int LS(int[] arr , int target) {
        if(arr.length==0){
            return -1;
        }

        // run a loop
        for (int i = 0; i < arr.length; i++) {
            // check for the element at every index if it is = target
            int element = arr[i];
           if  (element == target){
               return i ;
           }
        }

        // this line will execute if none of the return statement above have executed
        // hence the target not found
        return -1;
    }
}
