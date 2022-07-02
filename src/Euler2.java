public class Euler2 {
    public static void main(String... args) {
        long sum = 0;

        int prevPrev = 1;
        int prev = 2;

        while(true) {
            int current = prevPrev + prev;
            if (current >= 4_000_000) {
                break;
            }
            sum += current;
            prevPrev = prev;
            prev = current;
        }
        System.out.println(sum);
    }
}
