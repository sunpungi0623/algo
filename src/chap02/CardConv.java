package chap02;

import java.util.Scanner;

public class CardConv {

    static int cardConv(int a, int b, char[] d) {
        int digits = 0;
        String dchar = "012456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do{
            d[digits++] = dchar.charAt(a % b);
            a /= b;
        }while (a != 0);

        for(int i = 0; i < digits / 2; i++) {
            char t = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i - 1] = t;
        }

        return digits;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, n, y, dno;
        char[] cno = new char[32];

        System.out.println("10진수를 기수 변환합니다.");
        do {
            do {
                System.out.print("변환하는 음이 아닌 정수: ");
                n = scanner.nextInt();
            }while (n < 0);
            do {
                System.out.print("어떤 진수로 변환할까요? (2~36): ");
                x = scanner.nextInt();
            }while (x < 2 || x > 36);

            dno = cardConv(n, x, cno);

            System.out.print(x + "진수로 ");
            for(int i = 0; i < dno; i++) {
                System.out.print(cno[i]);
            }
            System.out.println("입니다.");

            System.out.println("한 번 더 할까요? (1...예/0...아니요): ");
            y = scanner.nextInt();
        }while (y == 1);
    }
}
