package chap01;

import java.util.Scanner;

public class chap01Q16 {
    static void npira(int n) {
        int i;
        for(i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= (i - 1)*2+1; j++) {
                System.out.printf("%d", i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("이등변 삼각형 변의 길이: ");
            n = scanner.nextInt();
        } while (n <= 1);

        npira(n);
    }
}
