public class Main {
    public static void main(String[] args) {
        int k = 100;
        System.out.println(fibonacci(k));
    }
    public static long fibonacci(int K) {
        // Write your solution here
        if (K <= 0){
            return 0;
        }
        if (K == 1){
            return 1;
        }
        long f0 = 1;
        long f1 = 0;
        long f2 = 1;
        for(int i = 2; i <= K; i++){
            f0 = f1 + f2;
            f1 = f2;
            f2 = f0;
        }
        return f0;
    }
}