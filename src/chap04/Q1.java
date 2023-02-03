package chap04;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntStack s = new IntStack(64);

        while (true) {
            System.out.println();
            System.out.printf("현재 데이터 개수: %d / %d\n", s.size(), s.getCapacity());
            System.out.print("(1) 푸시 (2) 팝 (3) 피크 (4) 덤프 (5) 비움 (6) 검색 (7) 출력 (0) 종료: ");

            int menu = scanner.nextInt();
            if (menu == 0) break;

            int x;
            switch (menu) {
                case 1:
                    System.out.print("데이터: ");
                    x = scanner.nextInt();
                    try {
                        s.push(x);
                    } catch (IntStack.OverflowIntStackException e) {
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;

                case 2:
                    try {
                        x = s.pop();
                        System.out.println("팝한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;

                case 3:
                    try {
                        x = s.peek();
                        System.out.println("피크한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;

                case 4:
                    s.dump();
                    break;

                case 5:
                    s.clear();
                    break;

                case 6:
                    System.out.print("검색할 데이터 : ");
                    x = scanner.nextInt();
                    int n = s.indexOf(x);
                    if (n >= 0)
                        System.out.println("꼭대기에서 " + (s.size() - n) +"번째에 있습니다.");
                    else
                        System.out.println("그 데이터가 없습니다.");
                    break;

                case 7:
                    System.out.println("용량 : " + s.getCapacity());
                    System.out.println("데이터수 : " + s.size());
                    System.out.println("비어 " + (s.isEmpty()  ? "있습니다." : "있지 않습니다."));
                    System.out.println("가득 " + (s.isFull() ? "차 있습니다." : "차 있지 않습니다."));
                    break;
            }
        }
    }
}
