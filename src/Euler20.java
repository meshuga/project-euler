import java.math.BigInteger;

public class Euler20 {

    public static void main(String... args) {
        BigInteger product = new BigInteger("1");
        for(int i=1; i<=100; i++) {
            product = product.multiply(new BigInteger(Integer.toString(i)));
        }

        int result = 0;
        for(char num : product.toString().toCharArray()) {
            result += num - '0';
        }

        System.out.println(result);
    }
}
