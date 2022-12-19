package chap01;

import java.util.Scanner;

public class chap01Q14 {
    static void triangleLB(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void triangleLU(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void triangleRU(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRB(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
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

        triangleLB(n);
        triangleLU(n);
        triangleRU(n);
        triangleRB(n);

    }
}
