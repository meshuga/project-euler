public class Euler6 {

    public static void main(String... args) {
        int squareSum = 0;
        int sum = 0;

        for(int i=1; i<=100; i++) {
            squareSum += Math.pow(i, 2);
            sum += i;
        }
        double sumSquared = Math.pow(sum, 2);
        System.out.println((int)(sumSquared - squareSum));
    }
}
