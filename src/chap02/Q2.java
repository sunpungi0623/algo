package chap02;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
    }

    static void reverse(int[] a) {
        for(int i = 0; i < a.length / 2; i++) {
            System.out.println(Arrays.toString(a));
            swap(a, i, a.length - i - 1);
            System.out.println("a[" + i + "]과 a[" + (a.length - i -1) + "]을 교환합니다.");
        }
        System.out.println(Arrays.toString(a));
        System.out.println("역순 정렬을 마쳤습니다.");
    }

    public static void main(String[] args) {

        int[] x = {2, 5, 1, 3, 9, 6, 7};

        reverse(x);
    }
}
