package chap01;

import java.util.Scanner;

public class chap01Alternative1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("+와 -를 번갈아 n개 출력합니다.");
        System.out.print("n값: ");
        n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                System.out.print("+");
            }
            else {
                System.out.print("-");
            }
        }
    }
}
