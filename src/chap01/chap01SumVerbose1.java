package chap01;

import java.util.Scanner;

public class chap01SumVerbose1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int sum = 0;

        System.out.println("1부터 n까지의 합을 구합니다.");
        do {
            System.out.print("n값: ");
            n = scanner.nextInt();
        }while (n <= 0);

        for(int i = 1; i <= n; i++) {
            sum += i;
            if(i < n) {
                System.out.print(i + " + ");
            }
            else {
                System.out.print(i + " = ");
            }
        }
        System.out.println(sum);

    }
}
