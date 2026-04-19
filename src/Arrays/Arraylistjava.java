package Arrays;

// diff b/w array and arraylist :- array has fixed size but arraylist  has  not fixed  size (dynamic)
import java.util.*;
public class Arraylistjava {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(21);
        arr.add(18);
        arr.add(5);
        arr.add(10);

        System.out.println(arr.get(1));
        arr.set(3,50);
        System.out.println(arr.get(3));
        System.out.println(arr);
    }
}
