public class Euler7 {

    public static boolean isPrime(int number) {
        for(int i=2; i<=Math.sqrt(number); i++){
            if(number%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String... args) {
        int primeCounter = 1;
        int i = 1;
        while(true) {
            if (isPrime(i)) {
                if (primeCounter == 1_000) {
                    System.out.println(i);
                    break;
                } else {
                    primeCounter++;
                }
            }
            i++;
        }
    }
}
