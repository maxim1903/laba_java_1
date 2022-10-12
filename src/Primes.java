public class Primes {
/*    public static void main(String[] args) {
        for (int i = 2; i < 100; i++){
            boolean result = isPrime(i);
            if (result) {
                System.out.print(i + " ");
            }
        }
    } */
    public static boolean isPrime(int n) {
        int kolDel = 0; // перерменная отвечающая за кол-во делителей
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                kolDel++;
            }
        }
        return kolDel <= 0;
    }
}

