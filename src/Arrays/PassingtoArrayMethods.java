package Arrays;

public class PassingtoArrayMethods {
    public static void main(String[] args) {
        int [] x  = {5,15,21,42,553,64,21};
        System.out.println(x[3]);
        change(x);
        System.out.print(x[3]);

    }

    public static void change(int[] arr) {
        arr[3]=99;
    }
}
