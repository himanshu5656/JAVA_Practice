package Arrays;

public class indexingarray {
    public static void main(String[] args) {

        int[] x = { 6,89,65,121,56,9};
        //indexing
        System.out.println( x[4]);
        // updating
         x[4]=50;        // kisi bhi index ki value change krne ke leye
        System.out.println(x[4]);
        // new way to represent an array
        int[] arr =  new int[4];
        arr[0]=8;
        arr[1]=28;
        arr[2]=86;
        arr[3]=48;

        System.out.println(arr[3]);
    }
}
