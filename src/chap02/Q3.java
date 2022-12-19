package chap02;

public class Q3 {

    static int sumOf(int[] a) {
        int sum = 0;

        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] x = {2, 5, 1, 3, 9, 6, 7};

        System.out.println(sumOf(x));
    }
}
