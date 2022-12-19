package chap02;

import java.util.Arrays;

public class Q5 {

    static void rcopy(int[] a, int[] b) {
        for(int i = 0; i < a.length; i++) {
            b[i] = a[a.length - i - 1];
        }
    }

    public static void main(String[] args) {
        int[] x = {2, 5, 1, 3, 9, 6, 7};
        int[] y = new int[7];

        rcopy(x, y);
        System.out.println(Arrays.toString(y));
    }
}
