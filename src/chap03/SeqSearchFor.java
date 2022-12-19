package chap03;

import java.util.Scanner;

public class SeqSearchFor {
    static int seqSearch(int[] a, int n, int key) {
        for(int i = 0; i < n; i++) {
            if(a[i] == key)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = scanner.nextInt();
        int[] x = new int[num];

        for(int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]:");
            x[i] = scanner.nextInt();
        }
        System.out.print("검색할 값: ");
        int ky = scanner.nextInt();
        int idx = seqSearch(x, num, ky);
        if(idx == -1)
            System.out.print("그 값의 요수가 없습니다.");
        else
            System.out.print("그 값은 x[" + idx + "]에 있습니다.");
    }
}
