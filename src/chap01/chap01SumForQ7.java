package chap01;

import java.util.Scanner;

public class chap01SumForQ7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n의 값: ");
        int n = scanner.nextInt();
        int sum = (1+n) * (n/2) + (n % 2 == 1 ? (n +1) / 2 : 0);
        System.out.println("1부터 n까지의 정수 합: " + sum);
    }
}
