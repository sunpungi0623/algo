package chap02;

import java.util.Random;
import java.util.Scanner;

public class Q1 {

    static int maxOf(int[] a) {
        int max = a[0];
        for(int j = 1; j < a.length; j++) {
            if(a[j] > max) {
                max = a[j];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int n;

        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람 수: ");
        n = 1 + random.nextInt(20);
        System.out.println(n);

        int[] height = new int[n];

        for(int i = 0; i < n; i++) {
            height[i] = 100 + random.nextInt(90);
            System.out.println("height[" + i + "]: " + height[i]);
        }
        System.out.println("최댓값은 " + maxOf(height) + "입니다.");
    }
}
