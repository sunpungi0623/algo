package chap01;

import java.util.Scanner;

public class chap01SumFor2Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;

        System.out.print("a값: ");
        a = scanner.nextInt();
        while (true) {
            System.out.print("b값: ");
            b = scanner.nextInt();
            if(b > a) {
                break;
            }
            System.out.println("a보다 큰 값을 입력하세요!");
        }
        System.out.println("b - a는 "+ (b - a) + "입니다.");
    }
}
