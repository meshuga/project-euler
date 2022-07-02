import java.math.BigInteger;

public class Euler16 {

    public static void main(String... args) {
        BigInteger two = new BigInteger("2");
        char[] powResult = two.pow(1_000).toString().toCharArray();

        int result = 0;
        for(char num : powResult) {
            result += num - '0';
        }

        System.out.println(result);
    }
}
