package Arrays;
import java.util.*;
public class sortarraybuiltin {
    public static void main(String[] args) {
        int[] arr ={4,9,-2,5,1,7};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }

    public static void print(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}



//                  QUES; MULTIPLY 2 IN ODD ARRAY AND ADD 10 SUM IN EVEN ARRAY

//   import java.util.*;
//   class question{
//       public static void main(String[] args) {
//           int [] arr = { 2,5,15,12,10};
//           for (int i = 0; i < arr.length ; i++) {
//            if(i % 2==0)
//                arr[i]= arr[i] + 10;
//            else {
//                arr[i] = arr[i] * 2;
//                 }
//              }
//              for (int i = 0; i < arr.length; i++) {
//                System.out.println(arr[i] + " ");
//          }
//      }
//
//  }

