package chap01;

public class chap01Max03Q3 {
    static int min4(int a, int b, int c, int d) {
        int min = a;
        if(b < min) {
            min = b;
        }
        if(c < min) {
            min = c;
        }
        if(d < min) {
            min = d;
        }
        return min;
    }
    public static void main(String[] args) {
        System.out.println(min4(5,6,3,7));
    }
}
