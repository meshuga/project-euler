import java.io.IOException;
import java.util.*;

public class Euler24 {

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String... args) throws IOException {
        List<Integer> permutations = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        int originalPermutationsSize = permutations.size();

        int permutationNumber = 1_000_000;
        int permutationIndex = permutationNumber - 1;
        for(int i=0; i<originalPermutationsSize; i++) {
            int factorialDiv = factorial(permutations.size() - 1);
            int nrIndex = permutationIndex / factorialDiv;
            System.out.print(permutations.get(nrIndex));

            permutationIndex %= factorialDiv;
            permutations.remove(nrIndex);
        }
    }
}
