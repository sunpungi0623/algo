package chap01;

import java.util.Scanner;

public class chap01SumForQ8 {

    static int sumof(int a, int b) {
        int sum = 0;

        if(a > b) {
            sum = (b+a) * (a/2) + (a % 2 == 1 ? (a + b) / 2 : 0);
        }
        else {
            sum = (a+b) * (b/2) + (b % 2 == 1 ? (b + a) / 2 : 0);
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a의 값: ");
        int a = scanner.nextInt();
        System.out.print("b의 값: ");
        int b = scanner.nextInt();
        System.out.println("a 와 b 사이의 모든 정수의 합은 " + sumof(a, b) + "입니다.");

    }
}
