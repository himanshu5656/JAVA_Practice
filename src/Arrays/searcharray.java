package Arrays;

public class searcharray {
    public static void main(String[] args) {
        int [] arr = {12,3,27,93,18,34,6,53 };
        int target = 53;
        boolean flag=false;  // target array me nhi hai
        int index = -1;     // to find at which index element found
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                flag = true;
                index = i;
                break;
            }
        }
        if(flag) System.out.println("Target found in array:" + index );
        else System.out.println("Target missing in the array ");
    }
}
