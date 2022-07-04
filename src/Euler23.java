import java.io.IOException;
import java.util.*;

public class Euler23 {

    static TreeSet<Integer> abundantNumbers = new TreeSet<>();

    public static void checkAbundant(int number) {
        if (Euler21.getSumOfDivisors(number) > number) {
            abundantNumbers.add(number);
        }
    }

    public static void main(String... args) throws IOException {
        long sumNonAbundant = 0;
        i_loop:
        for(int i=1; i<28_123; i++) {
            checkAbundant(i);
            Iterator<Integer> ascendingIterator = abundantNumbers.iterator();
            Iterator<Integer> descendingIterator = abundantNumbers.descendingIterator();
            while(ascendingIterator.hasNext()) {
                Integer a = ascendingIterator.next();
                while (descendingIterator.hasNext()) {
                    Integer b = descendingIterator.next();
                    if (a+b == i) {
                        continue i_loop;
                    }
                }
            }
            sumNonAbundant += i;

        }
        System.out.println(sumNonAbundant);
    }
}
