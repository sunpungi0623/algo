package chap03;

import java.util.Scanner;

public class Q1 {
    static int seqSearchSen(int[] a, int n, int key) {
        int i;
        a[n] = key;

        for(i= 0; a[i] != key; i++);

        return i == n ? -1 : i;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = scanner.nextInt();
        int[] x = new int[num + 1];

        for(int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]:");
            x[i] = scanner.nextInt();
        }
        System.out.print("검색할 값: ");
        int ky = scanner.nextInt();
        int idx = seqSearchSen(x, num, ky);
        if(idx == -1)
            System.out.print("그 값의 요수가 없습니다.");
        else
            System.out.print("그 값은 x[" + idx + "]에 있습니다.");
    }
}
