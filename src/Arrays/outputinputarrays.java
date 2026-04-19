package Arrays;

import java.util.Scanner;

public class outputinputarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr = {2,-4,98,43,-23,47,65,93,-28};
//        int n = arr.length;
//        for (int i = 0; i <= n; i++) {
//            System.out.println(arr[i]);
//
//        }
        int[] aman = new int[7];

        // default value (where all value will be printed as 0 )
//        for (int i = 0; i <=7 ; i++) {
//            System.out.println(aman[i]);
//
//        }
//        o/p= 0 0 0 0 0 0 0

        // input
        for (int i = 0; i <=7; i++) {
            aman[i]= sc.nextInt();
            System.out.println(2 * aman[i]+ " ");  // agar input value ko double me print karna h toh 2 se multiply kar do

        }
    }
}
