package Arrays;

public class Reversearray {
    public static void main(String[] args) {
        int[] arr ={ 10,32,12,34,21,9,73};
         int n = arr.length;
         int i = 0, j =n-1;  // agar ham i ki value 1 lete h toh array index 0 ka value same rahega isliye hm 0 le rhe h
         while(i<j){
             // swap of i and j element
             int temp =arr[i];
             arr[i]= arr[j];
             arr[j]=temp;
             i++;
             j--;
         }
         for(int ele:arr) System.out.print(ele + " ");   // foreach method
    }
}
