package chap01;

public class chap01Multi99TableQ12 {
    public static void main(String[] args) {
        System.out.print("    | ");
        for(int a = 1; a <= 9; a++) {
            System.out.printf("%3d", a);
        }
        System.out.println();
        System.out.println("----+----------------------------");
        for(int i = 1; i <= 9; i++) {
            System.out.printf("%3d | ", i);
            for(int j = 1; j <= 9; j++) {
                System.out.printf("%3d", i + j);
            }
            System.out.println();
        }
    }
}
