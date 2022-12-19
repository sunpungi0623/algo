package chap02;

public class PrimeNumber2 {
    public static void main(String[] args) {
        int count = 0;
        int ptr = 0;
        int[] prime = new int[500];

        prime[ptr++] = 2;

        for(int i = 3; i <= 1000; i += 2) {
            int j;
            for(j = 1; j < ptr; j++) {
                count++;
                if(i % prime[j] == 0 ) {
                    break;
                }
            }
            if(ptr == j) {
                prime[ptr++] = i;
            }
        }

        for(int i = 0; i < ptr; i++) {
            System.out.println(prime[i]);
        }
        System.out.println("나눗셈을 수행한 횟수: " + count);
    }
}
