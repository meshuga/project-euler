public class Euler10 {

    public static void main(String... args) {
        int sum = 0;
        for (int i = 2; i <= 10; i++) {
            if(Euler7.isPrime(i)) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
