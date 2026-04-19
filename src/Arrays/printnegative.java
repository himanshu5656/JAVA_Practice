package Arrays;
// ques = take any array and print the negative array element  only ?
import java.util.Scanner;
public class printnegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 7, -9 , 7 , -43, 76};
        for (int i = 0; i <5 ; i++) {
            if(arr[i]<0) System.out.println(arr[i]);
        }
    }
}
