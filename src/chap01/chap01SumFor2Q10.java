package chap01;

import java.util.Scanner;

public class chap01SumFor2Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;

        do {
            System.out.print("값: ");
            a = scanner.nextInt();
        }while (a <= 0);

        int no = 0;
        while (a > 0) {
            a /= 10;
            no++;
        }

        System.out.println("그 수는 " + no + "자리입니다.");
    }
}
