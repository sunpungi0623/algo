package chap03;

import java.util.Scanner;

public class Q3 {

    static int searchIdx(int[] a, int n, int key, int[] b) {
        int count = 0;

        for(int i=0; i < n; i++) {
            if(a[i] == key)
                b[count++] = i;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = scanner.nextInt();
        int[] x = new int[num];
        int[] y = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]:");
            x[i] = scanner.nextInt();
        }
        System.out.print("검색할 값: ");
        int ky = scanner.nextInt();
        int count = searchIdx(x, num, ky, y);
        if (count == 0)
            System.out.println("그 값의 요소는 존재하지 않습니다.");
        else
            for (int i = 0; i < count; i++)
                System.out.println("그 값은 " + "x[" + y[i] + "]에 있습니다.");
    }
}
