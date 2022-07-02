public class Euler15 {

    public static void main(String... args) {
        int gridSize = 20;
        int pathSize = gridSize + 1;
        int[][] pathsMatrix = new int[pathSize][pathSize];

        for(int i=0; i<pathSize; i++) {
            for(int j=0; j<pathSize; j++) {
                if( i ==0 && j == 0) {
                    pathsMatrix[0][0] = 1;
                    continue;
                }
                int pathNum = 0;
                if (i >= 1) {
                    pathNum += pathsMatrix[i-1][j];
                }
                if (j >= 1) {
                    pathNum += pathsMatrix[i][j-1];
                }
                pathsMatrix[i][j] = pathNum;
            }
        }

        System.out.println(pathsMatrix[gridSize][gridSize]);
    }
}
