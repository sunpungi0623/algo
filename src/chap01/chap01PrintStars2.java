package chap01;

import java.util.Collections;
import java.util.Scanner;

public class chap01PrintStars2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, w;

        System.out.println("*를 n개 출력하되 w개마다 줄을 바꿔서 출력합니다.");
        System.out.print("n값: ");
        n = scanner.nextInt();
        System.out.print("w값: ");
        w = scanner.nextInt();
        String s = "*";
        for(int i = 0; i < n; i++) {
            System.out.println(Collections.nCopies(w,s));
        }
        int rest = n % w;
        if(rest != 0) {
            System.out.println(Collections.nCopies(rest,s));
        }
    }
}
