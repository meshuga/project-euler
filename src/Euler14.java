public class Euler14 {

    static long collatzNumber(long n) {
        if ((n%2) == 0) {
            return n/2;
        } else {
            return 3*n+1;
        }
    }
    static final int number = 1000000;
    static int[] collatzSequenceCache = new int[number+1];

    public static void main(String... args) {

        long maxLength = 0;
        long highestSeqNum = 0;
        long seq;

        for (int i=2; i <= number; i++) {
            int numLength = 1;
            seq = i;
            while (seq != 1) {
                if(seq < number+1 && collatzSequenceCache[(int)seq] != 0) {
                    numLength += collatzSequenceCache[(int)seq];
                    break;
                }

                seq = collatzNumber(seq);
                numLength++;
            }
            collatzSequenceCache[i] = numLength;

            if (maxLength < numLength) {
                maxLength = numLength;
                highestSeqNum = i;
            }
        }
        System.out.println(highestSeqNum);
    }
}
