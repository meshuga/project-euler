public class Euler21 {

    public static boolean isAmicableNumber(int a) {
        int sumOfDivisors = getSumOfDivisors(a);
        return a == getSumOfDivisors(sumOfDivisors);
    }

    public static int getSumOfDivisors(int number) {
        int sumOfDivisors = 0;
        for(int i = 1; i<= number /2; i++){
            if(number %i == 0) {
                sumOfDivisors += i;
            }
        }
        return sumOfDivisors;
    }

    public static void main(String... args) {
        int amicableSum = 0;
        for(int i=1; i<=10_000; i++) {
            if(isAmicableNumber(i)) {
                amicableSum += i;
            }
        }

        System.out.println(amicableSum);
    }
}
