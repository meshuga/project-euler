public class Euler9 {

    public static void main(String... args) {
        for (int i = 1; i <= 998; i++) {
            for (int j = 2; j <= 999; j++) {
                for (int k = 3; k <= 1000; k++) {
                    if (Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(k, 2)) {
                        if (i+j+k == 1000) {
                            System.out.printf("%d %d %d%n", i, j, k);
                            return;
                        }
                    }
                }

            }

        }
    }
}
