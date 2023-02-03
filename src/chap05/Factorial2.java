package chap05;

import java.util.Scanner;

public class Factorial2 {
    static int factorial(int n) {
        return (n > 0) ? n * factorial(n - 1) : 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요.: ");
        int x = scanner.nextInt();

        System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");
    }
}
