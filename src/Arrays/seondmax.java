package Arrays;

public class seondmax {
    public static void main(String[] args) {
        int[] arr = {10, 23, 45, 2, 54, 21, 34};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        // calculating max
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > smax && arr[i] != max) smax = arr[i];
        }
        System.out.println(max);
        System.out.println(smax);

    }
}