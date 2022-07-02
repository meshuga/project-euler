public class Euler3 {

    public static void main(String... args) {
        long largestPrime = 1;

        long testedNumber = 600851475143L;
        while(testedNumber%2 == 0) {
            testedNumber /= 2;
        }
        while(testedNumber%3 == 0) {
            testedNumber /= 3;
        }

        for (int i = 5; i< Math.sqrt(testedNumber); i+=6) {
            while(testedNumber%i == 0) {
                largestPrime = i;
                testedNumber /= i;
            }
        }

        System.out.println(largestPrime);
    }
}
