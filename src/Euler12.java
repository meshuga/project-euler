public class Euler12 {
    
    public static void main(String... args) {
        int i=1;
        while(true) {
            int triangleNum = 0;
            for(int j=1; j<=i; j++) {
                triangleNum += j;
            }
            i++;
            int factorsCount = 0;
            for(int j=1; j<=triangleNum; j++) {
                if (triangleNum %j == 0) {
                    factorsCount++;

                    triangleNum /= j;
                }
            }
            if(factorsCount > 500) {
                System.out.println(triangleNum);
                break;
            }
        }
    }
}
