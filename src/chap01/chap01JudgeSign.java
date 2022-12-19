package chap01;

import java.util.Scanner;

public class chap01JudgeSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요.: ");
        int a = scanner.nextInt();
        if(a > 0) {
            System.out.println("이 수는 양수입니다.");
        }
        else if (a < 0) {
            System.out.println("이 수는 음수입니다.");
        }
        else
            System.out.println("이 수는 0입니다.");
    }
}
