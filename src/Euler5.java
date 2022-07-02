public class Euler5 {

    public static void main(String... args) {
        int i=21;
        outer:
        while(true) {
            for(int j=2; j<=20; j++) {
                if (i%j != 0) {
                    i++;
                    continue outer;
                }
            }
            System.out.println(i);
            return;
        }
    }
}
