public class Euler4 {

    public static void main(String... args) {
        int maxPalindrome = -1;
        for(int i=100; i<1000; i++) {
            for( int j=100; j<1000; j++) {
                int testingNum = i*j;
                if (isPalindrome(testingNum)) {
                    maxPalindrome = testingNum;
                }
            }
        }
        System.out.println(maxPalindrome);
    }

    private static boolean isPalindrome(int testingNum) {
        char[] decimals = Integer.toString(testingNum).toCharArray();
        int ptr = 0;
        while(ptr<decimals.length/2) {
            if(decimals[ptr] != decimals[decimals.length-ptr-1]) {
                return false;
            }
            ptr++;
        }
        return true;
    }
}
