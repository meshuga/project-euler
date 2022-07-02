public class Euler21 {

    public static boolean isAmicableNumber(int a) {
        int sumOfDivisorsA = 0;
        int sumOfDivisorsD = 0;
        for(int i=1; i<=a/2; i++){
            if(a%i == 0) {
                sumOfDivisorsA += i;
            }
        }
        for(int i=1; i<=sumOfDivisorsA/2; i++){
            if(sumOfDivisorsA%i == 0) {
                sumOfDivisorsD += i;
            }
        }
        return a == sumOfDivisorsD;
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
